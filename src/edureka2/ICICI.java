package edureka2;
class ICICI implements BankInter 
{
 public void deposit(int amt){
  System.out.println("ICICI Deposit Rs." +amt);
 }
 public void withdraw(int amt){
  System.out.println("ICICI Withdraw Rs." +amt);
 }
}
