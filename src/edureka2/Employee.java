package edureka2;
class Employee 
{
	int empno;
	String name;
	float sal;
    
	void setDetails(){
     empno=102;
	 name="Naveen";
	 sal=2500.5f;
	}

	void getDetails(){
     System.out.println(empno+" | "+name+" | "+sal);
	}

	public static void main(String[] args) 
	{
		//create an object of Employee type
		Employee emp = new Employee();
		System.out.println(emp.getClass().getName());

		System.out.println(emp.empno+" | "+ emp.name+" | "+ emp.sal);

		//change the state with reference
		emp.empno=101;
		emp.name="Sunil Joseph";
		emp.sal=8500.5f;
		emp.getDetails();
		
		//change the state of object with method
		emp.setDetails();
		emp.getDetails();
	}
}
