package edureka1;
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintTable(n);
		
		
	}
	static void PrintTable(int n) {
		int i=1;
		System.out.println("First 10 Natural Numbers are");
		while (i<=10) {
			System.out.println(n+" * "+i+" ="+n*i);
			i++;
		}
	}
}
