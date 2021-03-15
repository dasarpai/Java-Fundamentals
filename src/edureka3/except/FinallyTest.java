package edureka3.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			System.out.print("enter second no: ");
			int y = sc.nextInt();
		
			int z = x/y;
			System.out.println("result = "+ z);
		}
		catch(ArithmeticException ex) {
			System.out.print("Catch Block : ");
			System.out.println(ex.toString());
		}
		finally {
 		 /*clean-up code*/
		 System.out.println("Finally Block **");
		 System.out.println("application designed & developed by");
		 System.out.println("team @ edureka");
		 sc.close();
		}
		
		System.out.println(" ** DONE **");
	}

}
