package BDAssignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			al.add( sc.nextInt());
		}
		
		Iterator<Integer> itr = al.iterator();
		int sum=0, i=0;
		while (itr.hasNext()) {
			int val = itr.next();
			if (i%2==0) {
				sum=sum+val;
			}
			i++;
		}
		/*for (int i=0; i<n; i=i+2) {
			sum = sum+al.get(i);
		}
		
		*/
		System.out.println(sum);

	}

}