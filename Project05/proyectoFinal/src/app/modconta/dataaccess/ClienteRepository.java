package app.modconta.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Cliente;

public class ClienteRepository implements IRepository<Cliente> {

	public ClienteRepository() {
	}

	@Override
	public void Create(Cliente p) {
        String sql = "";
        //creamos la conexion a la base de datos - inicia 
        dbBean con = new dbBean();
        try{
        	//DECLARACION DE LA QUERY CREATE 
        	sql = "insert into clientes (ap_paterno,ap_materno,nombre,telefono,direccion,estado,sexo,DNI,RUC) values ('" + p.getApellidoP()+"','"+p.getApellidoM()+"', '"+ p.getNombre() + "', '"+  p.getTelefono()+"', '"+p.getDireccion()+"', 'S','"+ p.getSexo().charAt(0)+"', '"+  p.getDNI() + "', '"+p.getRUC() +"')" ;
        	//SE CREA UNA SENTENCIA 
        	Statement s = con.getConnection().createStatement();
             s.executeUpdate(sql);
             //SE CIERRA LA CONEXION
             con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }	
	}

	@Override
	public void Update(Cliente p) {
		  
	}

	@Override
	public void Delete(int id) {
		int resultado = 0;
        String sql = "";
        //CREA LA CONEXION A LA BD
        dbBean con = new dbBean();   
        try{
        	//DECLARAMOS LA QUERY DELETE 
        	sql = "delete from clientes  where idCliente = '"+id+"'";
        	//SE EEJCUTA LA QUERY 
	        resultado = con.updateSQL(sql);
	        //SE CIERRA LA CONEXION
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
		
	}

	@Override
	public Cliente Find(int code) {
	
		//DECLARA LA QUERY 
		    String sql = "SELECT * FROM clientes WHERE idcliente = ?";
		    //EMPIEZA LA CONEXION
		    dbBean con = new dbBean();
		    //SE CREA UN OBJETO DE LA CLASE CLIENTE 
		    Cliente cliente = null;
		    
		    try {
		    	//el prepared statement nos prepara una consulta que se usa como parametro 
		        PreparedStatement stmt = con.getConnection().prepareStatement(sql);
		        //se inicializa(condicion 1 de la query, arugmento de busqueda) 
		        stmt.setInt(1, code);
		        //se ejcuta la consulta 
		        ResultSet rs = stmt.executeQuery();
		        //si se encuenta la consulta (.NEXT BUCLE EN SQL)
		        //.NEXT ES NATIVO DEL DRIVER
		        if (rs.next()) {
		            cliente = new Cliente();
		            cliente.setIdCliente(rs.getInt("idcliente"));
		        }
		    //CIERRA LA CONEXION
		        con.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    
		    return cliente;
		}

	@Override
	public List<Cliente> readAll() {
        List<Cliente> ClientesCollection = new ArrayList<>();
        //SE CREA LA CONEXION
        dbBean con = new dbBean();
        //CREACION UNA PREPACION DE SENTENCIA
      PreparedStatement pe = null;
     try {
    	 //SE CREA LA CONEXION CON EL PROCEDIMIENTO ALMACENADO 
         pe = con.dbCon.prepareCall("usp_clientes_listar");
         //EL PROCEDIMENTO ALMACENADO TIENE COMO QUERY "SELECT * FROM CLIENTES"
     } catch (SQLException ex) {
         Logger.getLogger(ClienteRepository.class.getName()).log(Level.SEVERE, null, ex);
     }
      try{
    	  //EJECUCION DE LA QUERY DEL PROCEDIMIENTO ALMACENADO
            ResultSet resultado = pe.executeQuery();
            //ENTRA A UN BUCLE PARA LA LECTURA DE LOS DATOS DE CADA REGISTRO EN CADA CAMPO
            while(resultado.next()){
                Cliente clien;
                clien = new Cliente();
                clien.setIdCliente(resultado.getInt(1));
                clien.setNombre(resultado.getString(4));
                clien.setApellidoP(resultado.getString(2));
                clien.setApellidoM(resultado.getString(3));
                clien.setTelefono(resultado.getString(5));
                clien.setDireccion(resultado.getString(6));
                clien.setEstado(resultado.getString(7));
                clien.setSexo(resultado.getString(8));
                clien.setDNI(resultado.getString(9));
                clien.setRUC(resultado.getString(10));
                ClientesCollection.add(clien);     
            }
            //SE CIERRA LA CONEXION 
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
      	//
        return ClientesCollection;  
	}

}
