package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Contrato;
import app.modconta.entity.Empleado;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class EmpleadoDAO {
  
	
	public Vector<Empleado> ListaItem(boolean sw, String str){
        Vector<Empleado> item = new Vector<Empleado>();
        dbBean con = new dbBean();
        String sql = "Select * from Empleado";
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }
    	System.out.print("test");
        System.out.println("FII: "+ sql);
        try{
      
        
            ResultSet resultado = con.execSQL(sql);
        	System.out.print("test");
            while(resultado.next()){
                 Empleado e ; 
                 e = new Empleado();
                 e.setIdEmpleado(resultado.getInt(1));
                 e.setApellidoPaterno(resultado.getString(2));
                 e.setApellidoMaterno(resultado.getString(3));
                 e.setNombre(resultado.getString(4));
                 e.setSexo(resultado.getString(5));
                 e.setTelefono(resultado.getString(7));
                 e.setDireccion(resultado.getString(10));
                 e.setDNI(resultado.getString(11));
                item.addElement(e);     
            }
            
        }catch(java.sql.SQLException e){
        	System.out.print("ocurri� un error" + e.getMessage());
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return item;
  } 
  
  //funcion procesar 
    public int procesaItem(Empleado p, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar
         //  sql2= " insert into Contrato values ('"+ p.getIdEmpleado()+"', '"+ p.getFechaInicio() +"', '"+ p.getFechaFinal() +"', '"+ p.getSueldo() +"', '"+ p.getCargo() +"');";
         //sql = sql + " insert into Contrato values ('"+ p.getIdEmpleado()+"', '"+ p.getFechaInicio() +"', '"+ p.getFechaFinal() +"', '"+ p.getSueldo() +"', '"+ p.getCargo() +"');";
         sql = "insert into Empleado values ('"+ p.getIdEmpleado()+"','"+ p.getCodigoContrato()+"','"+ p.getNombre()+"','"+ p.getApellidoPaterno()+"','"+p.getSexo()+"','"+  p.getTelefono()+"','"+ p.getDNI() +"','"+p.getDireccion()+ "')";
         
        }
        if(proc.equals("update")){ 
            //actualizar 
            //el criterio de busqueda , se basa en ingresar el código de CLiente
            //sql = "update Cliente set Nombre = '"+ p.getNombre() +"', Telefono = '"+ p.getTelefono()+"', Grado = '"+ p.getGrado() +"',Grupo='"+p.getGrupo()+"', RUC = '"+ p.getRUC() +"' where idCliente = '"+ p.getIdCliente() +"'";
        }
        try{
            //resultado = con.updateSQL(sql2);
            resultado = con.updateSQL(sql);        
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
