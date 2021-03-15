package BDAssignment1;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<6; i++) {
			al.add( sc.nextInt());
		}
		//System.out.println(al);
		System.out.print(al.get(3-1)+" ");
		
		al.set(5-1, 8);
		System.out.print(al.get(5-1)+" ");
		
		System.out.print(al.indexOf(56)+" ");
		
		al.add(2,44);
		
		System.out.print(al.get(5-1)+" ");
		
		al.remove(1);
		
		System.out.print(al.indexOf(9)+" ");
		

	}

}