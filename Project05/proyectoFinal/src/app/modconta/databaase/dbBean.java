
package app.modconta.databaase;

import app.modconta.entity.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbBean {
    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=dblogistica;integratedSecurity=true";
    String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    public Connection dbCon;
    private String Login=Constantes.user_sa;
    private String password=Constantes.clave_sa;

    
  public dbBean(){
	  getConnection();
  }
 
  public Connection getConnection()
   {
      Connection cn= null;
        try {
            Class.forName(dbDriver);
             cn = DriverManager.getConnection(Constantes.CADENA_CONEXION);
             this.dbCon = cn;
           } catch (Exception e) {
            System.out.println(e);
           }
        return cn;
    }
  
  public void close() throws SQLException{
        dbCon.close();
  }

  public ResultSet execSQL(String sql) throws SQLException{
                    Statement s = dbCon.createStatement();
                    ResultSet r = s.executeQuery(sql);
                    return (r == null) ? null : r;
  }

  public int updateSQL(String sql) throws SQLException{
                   Statement s = dbCon.createStatement();
                   int r = s.executeUpdate(sql);
                   return (r == 0) ? 0 : r;
                }

  public boolean procedureSQL(String sql) throws SQLException{
                   Statement s = dbCon.createStatement();
                   boolean r = s.execute(sql);
                   return r;
                }

  public void commit() throws SQLException{
        dbCon.commit();
             }

  public void rollback() throws SQLException{
        dbCon.rollback();
             }
  public void AutoCommit(boolean estado) throws SQLException{
        dbCon.setAutoCommit(estado);
             }
   
}