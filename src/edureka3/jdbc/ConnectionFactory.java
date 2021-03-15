package edureka3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory 
{
 static Connection con=null;	
 public static Connection getConnection() throws Exception
 {
	if(con == null)
	{
 	 Class.forName("com.mysql.jdbc.Driver");
		
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
	}
	return con;
 }
}
