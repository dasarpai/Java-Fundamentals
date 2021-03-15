package edureka3.except;

import java.util.Scanner;

public class Except2 
{
	static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int z = x/y;
		System.out.println("result = "+ z);

		sc.close();		
	}
	static void method2() {
		method3();
	}
	static void method1() {
		method2();
	}
	public static void main(String[] args) 
	{
		method1();
	}
}
