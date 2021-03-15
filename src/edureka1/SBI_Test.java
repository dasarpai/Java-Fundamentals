package edureka1;

public class SBI_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInter bank=null;
		bank = new SBI();
		bank.deposit(2500);
		bank.withdraw(300);
		
		bank=new ICICI();
		bank.deposit(2500);
		bank.withdraw(3000);
	}

}
