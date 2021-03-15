package edureka3.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecords1 {

	public static void main(String[] args) throws Exception
	{
		Connection con = ConnectionFactory.getConnection();
		
		Scanner sc = new Scanner(System.in);
		
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		 System.out.print("enter empno: ");	
		 int eno = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("enter name: ");
		 String name = sc.nextLine();
		 
		 System.out.print("enter salary: ");
		 float sal = sc.nextFloat();
		 
		 try {
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			if(n>0)
				System.out.println("Employee Saved!");
		 }
		 catch(Exception ex) {
			 System.out.println(ex.toString());
		 }
		 
		 System.out.print("do you have more registrations[Y/N]: ");
		 req=sc.next();
		}
	}
}
