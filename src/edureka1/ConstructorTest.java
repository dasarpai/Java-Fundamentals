package edureka1;
public class ConstructorTest {
	int empno;
	String name;
	float sal;
	
	ConstructorTest() {
		System.out.println("****");
		this.empno=102;
		this.name="Naveen";
		sal=2000.8f;
	}
	
	ConstructorTest(String Name_) {
		System.out.println("****");
		name=Name_;
	}
	
	ConstructorTest(String Name, int Empno) {
		System.out.println("****");
		//constructor chaining
		//this(Name);
		/*this.name=Name;
		*/
		this.empno=Empno;
	}
	
	void getDetails() {
		System.out.println(empno + "|" + name + "|" + sal);
	}
	void setDetails() {
		empno=101;
		name="Hari";
		sal=2001.8f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest emp1 = new ConstructorTest();
		ConstructorTest emp2 = new ConstructorTest("Joseph");
		ConstructorTest emp3 = new ConstructorTest("Jeevan",200);
		
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
		
		emp1.setDetails();
		emp1.getDetails();

	}

}
