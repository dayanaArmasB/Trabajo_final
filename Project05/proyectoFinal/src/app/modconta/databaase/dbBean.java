package app.modconta.databaase;

import app.modconta.entity.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbBean {
    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=dblogistica1;integratedSecurity=true";
    String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    public Connection dbCon;


    
  public dbBean(){
	  getConnection();
  }
 //proporciona la conexion a la base de datos utilizando el controlador sqljdbc4
  public Connection getConnection()
   {
      Connection cn= null;
        try {
            Class.forName(dbDriver);
             cn = DriverManager.getConnection(Constantes.CADENA_CONEXION);
             dbCon = cn;
           } catch (Exception e) {
            System.out.println(e);
           }
        return cn;
    }
  //termina la conexion
  public void close() throws SQLException{
        dbCon.close();
  }
//ejecuta las consultas con un obejto statement (este es propio del driver de coexion a la base de datos
  public ResultSet execSQL(String sql) throws SQLException{
                    Statement s = dbCon.createStatement();
                    ResultSet r = s.executeQuery(sql);
                    return (r == null) ? null : r;
  
  }
  
  //ejecuta una actualizacion usando el objeto statement 
  public int updateSQL(String sql) throws SQLException{
                   Statement s = dbCon.createStatement();
                   int r = s.executeUpdate(sql);
                   return (r == 0) ? 0 : r;
                }




   
}