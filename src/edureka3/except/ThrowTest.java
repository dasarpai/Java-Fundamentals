package edureka3.except;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   	  try {
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		if(y==0) {			
			//ArithmeticException aex = new ArithmeticException();
			ArithmeticException aex = new ArithmeticException("cannot / by zero");
			throw aex;
		}
		int z = x/y;
		System.out.println("result = "+ z);
		}
		catch(Exception ex) {
			System.out.println("Message: "+ ex.getMessage());
			System.out.println(ex.toString());
		}
		

		sc.close();		

	}

}
