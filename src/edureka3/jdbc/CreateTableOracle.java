package edureka3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle 
{
  public static void main(String[] args) throws Exception
  {
	//Initialize an appropriate JDBC Driver
	Class.forName("oracle.jdbc.driver.OracleDriver");		
	
	//Connect to DB Server
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java66","password");
	System.out.println(">>> Connected to DB Server");
	
	Statement st = con.createStatement();
	System.out.println(">>> Created Statement to pass SQL queries");
	
	String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key(empno))";
	
	try {
		st.execute(sql);
		System.out.println("DB table created!");
	}
	catch(Exception e) {
		System.out.println("Exception ::" +e.toString());
	}
	
	System.out.println("<<< Close the connection with DB");
	st.close();
	con.close();
 }
}
