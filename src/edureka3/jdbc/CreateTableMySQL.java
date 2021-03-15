package edureka3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int(5) primary key,ename varchar(30), sal float(10,2))";
		
		try {
			st.execute(sql);
			System.out.println("DB Table created!");
		}
		catch(Exception ex) {
			System.out.println("Exception: "+ex.toString());
		}
		st.close();
		con.close();
	}
}
