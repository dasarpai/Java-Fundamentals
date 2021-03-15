package edureka2;
class BankTest 
{
	public static void main(String[] args) 
	{
		BankInter bank=null;

		bank = new SBI();
		bank.deposit(2500);
		bank.withdraw(2500);
		System.out.println("------------------");

		bank = new ICICI();
		bank.deposit(2500);
		bank.withdraw(2500);
	}
}
