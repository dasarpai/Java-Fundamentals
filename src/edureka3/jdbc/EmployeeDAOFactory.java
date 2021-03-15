package edureka3.jdbc;

public class EmployeeDAOFactory 
{
 static EmployeeDAO dao = null;	
 public static EmployeeDAO getEmployeeDAO() throws Exception
 {
	 if(dao == null)
	  dao = new EmployeeDAOImpl();
	 
	 return dao;
 }
}
