package edureka3.jdbc;

import java.util.List;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		//EmployeeDAO dao = new EmployeeDAOImpl();
		/*
		//to save an employee
		Employee emp = new Employee(110,"Srikanth",25000);
		dao.saveEmp(emp);
		*/
		
		/*
		//to update an Employee
		Employee emp = new Employee(101,"Sunil Joseph",50000);
		dao.updateEmp(emp);
		*/
		
		/*
		//searching an employee
		Scanner sc = new Scanner(System.in);
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		Employee emp = dao.searchEmp(eno);
		if(emp != null)
			System.out.println(emp); //toString()
		else
			System.out.println("No matching employee found!");
		
		sc.close();
		*/
		
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps)
		{
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}
}