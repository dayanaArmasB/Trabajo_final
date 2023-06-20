package app.modconta.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.midi.SysexMessage;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Producto;

public class ProductoRepository implements IRepository<Producto>{

	public ProductoRepository() {
	}

	@Override
	public void Create(Producto p) {
		   int resultado = 0;
	        String sql = "";
	        dbBean con = new dbBean();
	        try
	        {    
		        sql = "insert into productos (nombre,descripcion,estado,Stock,Stock_max,Stock_min) values ('"+p.getNombre()+"', '"+ p.getDescripcion()+"', 'S', '"+ p.getStock()+"', '"+ p.getStockMax()+"', '"+ p.getStockMin()+"')"; 
		        Statement s = con.getConnection().createStatement();
	             s.executeUpdate(sql);
	            con.close();
	        }catch(java.sql.SQLException e){
	            e.printStackTrace();
	        }     
	}

	@Override
	public void Update(Producto p) {
		  int resultado = 0;
	        String sql = "";
	        dbBean con = new dbBean();   
	        try{
		        sql = "update Cliente set Nombre = '"+ p.getNombre()+"' where idproducto = '"+ p.getIdProducto()+"'";
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
        	sql = "delete from productos where idproducto = '"+id+"'";
	        resultado = con.updateSQL(sql);
	        con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
	}

	@Override
	public Producto Find(int code) {
		return null;
	}

	@Override
	public List<Producto> readAll() {
	       List<Producto> ProductosCollection  = new ArrayList<>();
	        dbBean con = new dbBean();
	        PreparedStatement pe = null;
	        try {
	            pe = con.dbCon.prepareCall("usp_productos_listar");
	        } catch (SQLException ex) {
	            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        try{
	        	ResultSet resultado = pe.executeQuery();
	            while(resultado.next()){
	                Producto Produc; 
	                Produc = new Producto();
	                Produc.setIdProducto(resultado.getInt(1));
	                Produc.setNombre(resultado.getString(2));
	                Produc.setDescripcion(resultado.getString(3));
	                Produc.setEstado(resultado.getString(4));
	                Produc.setStock(resultado.getInt(5));
	                Produc.setStockMax(resultado.getInt(6));
	                Produc.setStockMin(resultado.getInt(7));
	                ProductosCollection.add(Produc);
	            }            
	            con.close();
	        }catch(java.sql.SQLException e){
	            e.printStackTrace();
	        }
	        return ProductosCollection;
	}

}
