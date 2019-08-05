
package navadhara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class database {
    public static String url="jdbc:derby:ayu";
    //public static String url="jdbc:derby://localhost:1527/ayu";
    public static String driverName="org.apache.derby.jdbc.ClientDriver";
    public static String username="ayu";
    public static String password="ayu";
    public static Connection con;
    public static Statement statement;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Connection getConnection()
    {
        try
        {
            Class.forName(driverName);
            con=DriverManager.getConnection(url,username,password);
            
        }
                catch(SQLException se)
{
    se.printStackTrace();
}
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
        
}
}
