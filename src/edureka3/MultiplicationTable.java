package edureka3;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number's Table: ");
		int num = sc.nextInt();
		
		/*method call*/
		printTable(num);
		
		sc.close();
	}
	
	/*method definition*/
	static void printTable(int n)
	{
		for(int i=1;i<=10;i++) {
			int p = n * i;
			System.out.println(n+" x "+i+" = "+p);
		}
	}

}
