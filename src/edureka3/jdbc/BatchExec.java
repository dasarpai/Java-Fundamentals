package edureka3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java66","password");
		
		con.setAutoCommit(false);
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into emp values(101,'Sunil',123.45)");
		st.addBatch("insert into emp values(102,'Anil',223.45)");
		st.addBatch("insert into emp values(103,'Naveen',323.45)");
		st.addBatch("update emp set sal = 5000");
		
		try
		{
		 int[] rows_affected = st.executeBatch();
		 for(int n : rows_affected) {
			 System.out.println("Records Affected = "+ n);			 
		 }
		 con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}
