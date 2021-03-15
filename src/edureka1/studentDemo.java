package edureka1;

public class studentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student("Ravi", 1001, 14, 6, 40, 24, 50, 22, 46);
		student s2 = new student(1002, 15, 6, 45, 14, 30, 12, 66);
		student s3 = new student();
		student s4 = new student("Jose",1005);
		
		System.out.println(s1.result());
		System.out.println(s2.result());
		System.out.println(s3.result());
		System.out.println(s4.name);
		
		System.out.println(s1.college);
		student.college_name();
		System.out.println(s1.college);
		
				
				

	}

}
