package edureka1;
import java.util.Scanner;

public class PrintRC {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is Name");
		String name=sc.nextLine();
		
		System.out.println("How Many Subjects: ");
		int no = sc.nextInt();
		
		int[] marks = new int[no];
		enterMarks(marks);
		printRC(name, marks);

	}
	static void printRC(String name, int[] marks) {
		System.out.println(name);
		int sum=0;
		for (int i=0; i<marks.length; i++) {
			sum+=marks[i];
		}
		float avg= 0;
		avg = sum/marks.length;
				
		System.out.println("Total "+ sum+ " average:"+ avg);
		
	}
	static void enterMarks(int[] marks) {
		for (int i=0; i<marks.length; i++) {
			System.out.print("Enter Marks for "+(i+1)+" Subject:");
			marks[i]= sc.nextInt();
			
			
		}
		
	}

}
