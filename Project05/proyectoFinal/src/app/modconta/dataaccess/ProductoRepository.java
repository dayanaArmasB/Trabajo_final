package app.modconta.dataaccess;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Producto;

public class ProductoRepository implements IRepository<Producto>{

	public ProductoRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Create(Producto p) {
		   int resultado = 0;
	        String sql = "";
	        dbBean con = new dbBean();
	        try
	        {    
		        sql = "insert into Equipo values ('"+ p.getIdProducto()+"', '"+p.getNombre()+"', "+ p.getStock()+","+ p.getStockMax()+"," +p.getStockMin()+","+p.getIdModelo()+")"; 
	         	resultado = con.updateSQL(sql);
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
		        sql = "update Cliente set Nombre = '"+ p.getNombre()+"' where idEquipo = '"+ p.getIdProducto()+"'";
		        resultado = con.updateSQL(sql);
		        con.close();
	        }catch(java.sql.SQLException e){
	            e.printStackTrace();
	        }
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto Find(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> readAll() {
	       List<Producto> lsproductos  = new ArrayList<>();
	        dbBean con = new dbBean();
	        String sql = "Select idproducto,nombre from productos";
	        //El criterio de busqueda para mostrar datos 
	       /* if(sw == true)
	        {
	            sql = sql + " where Nombre_Equipo like '"+str +" %'";
	        }*/
	        try{
	            ResultSet resultado = con.execSQL(sql);
	            while(resultado.next()){
	                Producto e; 
	                e = new Producto();
	                e.setIdProducto(resultado.getInt(1));
	                e.setNombre(resultado.getString(2));
	                //e.setStock(resultado.getInt(7));
	                //e.setStockMax(resultado.getInt(8));
	                //e.setStockMin(resultado.getInt(9));
	                //e.setIdModelo(resultado.getInt(10));         
	                lsproductos.add(e);
	            }            
	            con.close();
	        }catch(java.sql.SQLException e){
	            e.printStackTrace();
	        }
	        return lsproductos;
	}

}
