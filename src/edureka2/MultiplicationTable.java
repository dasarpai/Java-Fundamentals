package edureka2;
import java.util.Scanner;

public class MultiplicationTable 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("enter a number: ");
  int n = sc.nextInt();
  
  printTable(n);
  sc.close();
 }
 
 static void printTable(int num)
 {
  for(int i=1;i<=10;i++)
  {
	int p = num*i;  
	System.out.println(num+" x "+i+" = "+p);  
  }
 }
}
