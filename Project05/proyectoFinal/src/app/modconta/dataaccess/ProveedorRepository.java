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
import app.modconta.entity.Producto;
import app.modconta.entity.Proveedor;

public class ProveedorRepository implements IRepository<Proveedor> {

	public ProveedorRepository() {

	}

	@Override
	public void Create(Proveedor p) {
        String sql = "";
        dbBean con = new dbBean();
        try{
        	sql = "insert into proveedor values ('" + p.getNombre() + "', '"+  p.getTelefono()+"', 'S', '"+p.getDireccion()+"',  '"+  p.getRUC() + "', '"+p.getCTA() +"')" ;
        	Statement s = con.getConnection().createStatement();
             s.executeUpdate(sql);
             con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }	
	}

	@Override
	public void Update(Proveedor param) {

		
	}

	@Override
	public void Delete(int id) {
		int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();   
        try{
        	sql = "delete from proveedor  where idproveedor = '"+id+"'";
	        resultado = con.updateSQL(sql);
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
		
	}

	@Override
	public Proveedor Find(int code) {
		String sql = "SELECT * FROM proveedor WHERE idproveedor = ?";
	    dbBean con = new dbBean();
	    Proveedor proveedor = null;
	    
	    try {
	        PreparedStatement stmt = con.getConnection().prepareStatement(sql);
	        stmt.setInt(1, code);
	        ResultSet rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	        	proveedor = new Proveedor();
	        	proveedor.setIdProveedor(rs.getInt("IdProveedor"));
	        }
	        
	        con.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return proveedor;
	}

	@Override
	public List<Proveedor> readAll() {
		List<Proveedor> ProveedorCollection = new ArrayList<>();
        dbBean con = new dbBean();
      PreparedStatement pe = null;
     try {
         pe = con.dbCon.prepareCall("usp_proveedores_listar");
     } catch (SQLException ex) {
         Logger.getLogger(ProveedorRepository.class.getName()).log(Level.SEVERE, null, ex);
     }
      try{
            ResultSet resultado = pe.executeQuery();
            while(resultado.next()){
                Proveedor provee;
                provee = new Proveedor();
                provee.setIdProveedor(resultado.getInt(1));
                provee.setNombre(resultado.getString(2));
                provee.setTelefono(resultado.getString(3));
                provee.setEstado(resultado.getString(4));
                provee.setDireccion(resultado.getString(5));
                provee.setRUC(resultado.getString(6));
                provee.setCTA(resultado.getString(7));
                ProveedorCollection.add(provee);     
            }
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }

        return ProveedorCollection;  
		
	}

}
