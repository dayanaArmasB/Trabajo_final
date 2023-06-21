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
import app.modconta.entity.Empleado;

public class EmpleadoRepository implements IRepository<Empleado> {

	
	@Override
	public void Create(Empleado p) {
        String sql = "";
        dbBean con = new dbBean();
        try{
        	sql = "insert into empleado (ap_paterno,ap_materno,nombre,SEXO,telefono,domicilio,DNI,estado,rol,cargo,area,sueldo)  values ('" + p.getApellidoPaterno()+"','"+p.getApellidoMaterno()+"', '"+ p.getNombre() + "', '"+  p.getSexo().charAt(0)+"','"+p.getTelefono()+"', '"+ p.getDireccion()+"', '"+  p.getDNI() + "','S','DYAB','"+ p.getCargo()+"','"+ p.getArea()+"','"+ p.getSueldo()+"')" ;
        	Statement s = con.getConnection().createStatement();
             s.executeUpdate(sql);
             con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }	
		
	}

	@Override
	public void Update(Empleado param) {

	}

	@Override
	public void Delete(int id) {
		int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();   
        try{
        	sql = "delete from empleado  where idempleado = '"+id+"'";
	        resultado = con.updateSQL(sql);
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
		
	}

	@Override
	public Empleado Find(int code) {
		 
		String sql = "SELECT * FROM empleado WHERE idempleado = ?";
	    dbBean con = new dbBean();
	    Empleado empleado = null;
	    
	    try {
	        PreparedStatement stmt = con.getConnection().prepareStatement(sql);
	        stmt.setInt(1, code);
	        ResultSet rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	        	empleado = new Empleado();
	            empleado.setIdEmpleado(rs.getInt("idempleado"));
	        }
	        
	        con.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return empleado;
	}

	@Override
	public List<Empleado> readAll() {
		List<Empleado> EmpleadosCollection = new ArrayList<>();
		dbBean con = new dbBean();
	      PreparedStatement pe = null;
	     try {
	         pe = con.dbCon.prepareCall("usp_empleados_listar");
	     } catch (SQLException ex) {
	         Logger.getLogger(ClienteRepository.class.getName()).log(Level.SEVERE, null, ex);
	     }
	      try{

	    	 ResultSet resultado = pe.executeQuery();
            while(resultado.next()){
                 Empleado emple ; 
                 emple = new Empleado();
                 emple.setIdEmpleado(resultado.getInt(1));
                 emple.setApellidoPaterno(resultado.getString(2));
                 emple.setApellidoMaterno(resultado.getString(3));
                 emple.setNombre(resultado.getString(4));
                 emple.setSexo(resultado.getString(5));
                 emple.setEstado(resultado.getString(6));
                 emple.setTelefono(resultado.getString(7));
                 emple.setRol(resultado.getString(8));
                 emple.setDireccion(resultado.getString(9));
                 emple.setDNI(resultado.getString(10));
                 emple.setCargo(resultado.getString(11));
                 emple.setArea(resultado.getString(12));
                 emple.setSueldo(resultado.getInt(13));
                 EmpleadosCollection.add(emple);     
            }       
          con.close();
      }catch(java.sql.SQLException e){
          e.printStackTrace();
      }
        return EmpleadosCollection;

	}

}
