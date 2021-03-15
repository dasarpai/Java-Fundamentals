package edureka1;
public class Account {
	long acno;
	String name;
	float bal;
	
	//constructor
	Account(long acno, String name, float bal){
		this.acno=acno;
		this.name=name;
		this.bal=bal;
	}
	
	void deposit (float amt) {
		this.bal=this.bal+amt;
		System.out.println("Rs. "+amt+" deposited || balance: "+ this.bal);
	}
	
	void withdraw(float amt) {
		if (this.bal>=amt) {
			this.bal=this.bal-amt;
			System.out.println("Rs."+amt+" debited || Balance "+ this.bal);
		}
		else {
			System.out.println("Not sufficient balance");
		}
	}
	float getbalance() {
		return this.bal;
	}
}
