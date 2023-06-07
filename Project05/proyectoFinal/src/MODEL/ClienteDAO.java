package MODEL;
import app.modconta.entity.Cliente;
import app.modconta.databaase.dbBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    
 public Vector<Cliente> ListaItem(boolean sw, String str) {
	 //procedimento almacenado
        Vector<Cliente> ClientesCollection = new Vector<Cliente>();
        dbBean con = new dbBean();
      PreparedStatement pe = null;
     try {
         pe = con.getConnection().prepareCall("usp_clientes_listar");
     } catch (SQLException ex) {
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                ClientesCollection.addElement(clien);     
            }
            
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
     //con.close();
        return ClientesCollection; 
    }
  
 public int procesaItem(Cliente p, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        con.getConnection();
        if(proc.equals("insert")){
            //insertar
            sql = "insert into clientes(ap_paterno,ap_materno,nombre,telefono,direccion,estado,sexo,DNI,RUC) values ('" + p.getApellidoP()+"','"+p.getApellidoM()+"', '"+ p.getNombre() + "', '"+  p.getTelefono()+"', '"+p.getDireccion()+"', 'S','"+ p.getSexo().charAt(0)+"', '"+  p.getDNI() + "', '"+p.getRUC() +"')" ;
            //System.out.println("la query es " + sql);
        }
        try{
        	Statement s = con.getConnection().createStatement();
             s.executeUpdate(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return resultado;       
    }    
}
