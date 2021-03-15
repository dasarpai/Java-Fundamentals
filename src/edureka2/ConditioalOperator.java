package edureka2;
import java.util.Scanner;

public class ConditioalOperator 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("enter first no: ");
	  int x = sc.nextInt();
	  
	  System.out.print("enter second no: ");
	  int y = sc.nextInt();
	  /*
	  int lar;	  
	  if(x>y)
	  {
		 lar = x; 
	  }
	  else
	  {
		 lar = y; 
	  }
	  */
	  
	  int lar = (x>y)?x:y;
	  
	  //System.out.println("Largest of ("+x+","+y+") = "+lar);
	  System.out.println(lar);
	  sc.close();
	}

}
