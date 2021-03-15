package edureka2;
class Employee5
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
	public static void main(String[] args){
		System.out.println("Inside class Employee");
	}
}

class ObjectTest1
{
	public static void main(String[] args) 
	{
		//create an object of Employee type
		Employee5 emp = new Employee5();
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
