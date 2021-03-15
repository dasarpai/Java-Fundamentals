package edureka1;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Account acc=null;
		while(true) {
			System.out.println("1. Create A/C");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			System.out.println("Enter an option");
			int opt = sc.nextInt();
			switch(opt) {
				case 1:{
					if (acc==null) {
						System.out.print("Enter a/c no:");
						long acno= sc.nextLong();
						
						System.out.print("Enter name:");
						String name = new String();
						name= sc.nextLine();
						
						System.out.print("Enter intial deposit");
						float amt= sc.nextFloat();
						
						acc= new Account(acno, name, amt);
					}
					break;
				}
				
				case 2:{
					if (acc !=null) {
						System.out.print("Enter amount to deposit");
						float amt= sc.nextFloat();
						acc.deposit(amt);
						
						
					}
					else {
						System.out.print("FYI: Create A/C first!");
					}
					break;
				}
				
				case 3:{
					if (acc !=null) {
						System.out.print("Enter amount to withdraw");
						float amt= sc.nextFloat();
						acc.withdraw(amt);
						
						
					}
					else {
						System.out.print("FYI: Create A/C first!");
					}
					break;
					
				}
				
				case 4:{
	
					if (acc !=null) {
						System.out.print("Your Balance is");
						System.out.print(acc.getbalance());
					}
					else {
						System.out.print("FYI: Create A/C first!");
					}
					break;
				}
				
				case 5:{
					System.out.println("Bye Bye");
					sc.close();
					System.exit(0);
					break;
				}
				default:{
					System.out.println("Invalid option entered... try again");
				
				}
			}
			
		}
	}

}
