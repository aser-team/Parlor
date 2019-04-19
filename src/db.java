
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Aspire
 */

public class db {
private Connection conn;
private Statement statement;

public Connection openConnectio() throws SQLException
{ if (conn==null){
  String url ="jdbc:mysql://localhost/";
  String dbname ="parlour";
  String driver = "com.mysql.jdbc.Driver";
  String username ="root";
    String password ="";
    
  try
  {
      Class.forName(driver);
      this.conn=(Connection)DriverManager.getConnection(url+dbname, username, password);
    System.out.println("Connected !");
  }
  catch(ClassNotFoundException | SQLException sqle)
  {    System.out.println("Not Connected !");
}
}
return conn;
}
}