package app.modconta.databaase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class util {
	public util(){

    }
     
 public ResultSet consultar(String sql) { 
        dbBean cons = new dbBean();
        ResultSet resultado = null; 
        try { 
            Statement sentencia; 
            sentencia = cons.getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return null; 
        }        
        return resultado; 
    }
}
