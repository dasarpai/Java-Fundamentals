package edureka2;
public class SwitchTest1 {

	public static void main(String[] args) {
		String course="Java";
		switch(course)
		{
		 case "C":
			 System.out.println("Opted for C Language");
			 break;
		 case "CPP":
			 System.out.println("Opted for C++ Language");
			 break;			 
		 case "Java":
			 System.out.println("Opted for Java Language");
			 break;			 
		 default:
			 System.out.println("Course Unavailable!");
		}

	}

}
