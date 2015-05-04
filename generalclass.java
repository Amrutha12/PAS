/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pas;
import java.sql.*;

/**
 *
 * @author Fine-Tune
 */
public class generalclass {
    
    Connection con=null;
public Connection getconnect()
{
    try
    {
        Class .forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con=DriverManager.getConnection("jdbc:sqlserver://FINETUNE5:1433;databaseName=PAS;username=sa;password=password09");
    }
    catch(Exception ex)
    {
    }
    return con;
}
}
