package edureka2;
class SBI implements BankInter 
{
 public void deposit(int amt){
  System.out.println("SBI Deposit Rs." +amt);
 }
 public void withdraw(int amt){
  System.out.println("SBI Withdraw Rs." +amt);
 }
}
