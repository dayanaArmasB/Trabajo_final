package app.modconta.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Cliente;

public class ClienteRepository implements IRepository<Cliente> {

	public ClienteRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Create(Cliente p) {
		int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        try{
        	sql = "insert into clientes values ('" + p.getApellidoP()+"','"+p.getApellidoM()+"', '"+ p.getNombre() + "', '"+  p.getTelefono()+"', '"+p.getDireccion()+"', 'S','"+ p.getSexo().charAt(0)+"', '"+  p.getDNI() + "', '"+p.getRUC() +"')" ;
        	Statement s = con.getConnection().createStatement();
             s.executeUpdate(sql);
             con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    
		
	}

	@Override
	public void Update(Cliente p) {
		int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();   
        try{
	        sql = "update Cliente set Nombre = '"+ p.getNombre()+"' where idCliente = '"+ p.getIdCliente()+"'";
	        resultado = con.updateSQL(sql);
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
		
	}

	@Override
	public void Delete(int id) {
		int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();   
        try{
        	sql = "delete from clientes  where idCliente = '"+id+"'";
	        resultado = con.updateSQL(sql);
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
		
	}

	@Override
	public Cliente Find(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> readAll() {
        List<Cliente> ClientesCollection = new ArrayList<>();
        dbBean con = new dbBean();
      PreparedStatement pe = null;
     try {
         pe = con.dbCon.prepareCall("usp_clientes_listar");
     } catch (SQLException ex) {
         Logger.getLogger(ClienteRepository.class.getName()).log(Level.SEVERE, null, ex);
     }
      try{
            ResultSet resultado = pe.executeQuery();
            while(resultado.next()){
                Cliente clien;
                clien = new Cliente();
                clien.setIdCliente(resultado.getInt(1));
                clien.setNombre(resultado.getString(2));
                clien.setApellidoP(resultado.getString(3));
                clien.setApellidoM(resultado.getString(4));
                clien.setTelefono(resultado.getString(5));
                clien.setDireccion(resultado.getString(6));
                clien.setSexo(resultado.getString(7));
                clien.setDNI(resultado.getString(8));
                clien.setRUC(resultado.getString(9));
                ClientesCollection.add(clien);     
            }
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }

        return ClientesCollection;  
	}

}
