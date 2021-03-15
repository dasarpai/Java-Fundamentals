package edureka3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101,'Sunil',2500.5)";
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("Employees Saved - "+ rows_affected);
		}
		catch(Exception ex) {
			System.out.println("Exception: "+ex.toString());
		}
		
		st.close();
		con.close();
	}

}
