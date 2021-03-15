package edureka3;
class Employee
{
 int empno;
 String name;
 float sal;
 
 Employee(int empno, String name, float sal)
 {
	 this.empno = empno;
	 this.name = name;
	 this.sal = sal;
 }

@Override //annotation
public String toString() {
  System.out.println(super.toString());	
  return "Employee["+this.empno+" | "+this.name+" | "+this.sal+"]";	
} 
 
}

public class EMS 
{
	public static void main(String[] args) 
	{
	   Employee emp = new Employee(101,"Naveen",2500);
	   System.out.println(emp); //toString()
	}
}
