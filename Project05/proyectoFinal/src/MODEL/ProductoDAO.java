package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProductoDAO {


    
public int FindID(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidmodelo= "Select idModelo,Nombre_Modelo from Modelo where Nombre_Modelo= '"+ s +"'";
     System.out.println(sidmodelo);
     ResultSet resultado2 = con2.execSQL(sidmodelo);
       while(resultado2.next()){
     System.out.println(resultado2.getInt(1));
     //id=Integer.parseInt(resultado2.getInt(1));
        id= resultado2.getInt(1);
       }
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return id; 
 
 }
    
    

    
public int FindIDEquipo(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidequipo= "Select idEquipo,Nombre_Equipo from Equipo where Nombre_Equipo= '"+ s +"'";
     System.out.println(sidequipo);
     ResultSet resultado2 = con2.execSQL(sidequipo);
       while(resultado2.next()){
     System.out.println(resultado2.getInt(1));
     //id=Integer.parseInt(resultado2.getInt(1));
        id= resultado2.getInt(1);
       }
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return id; 
 
 }

}
