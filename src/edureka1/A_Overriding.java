package edureka1;

class A2 extends java.lang.Object{
	int a=10, b=20;
	void display() {
		System.out.println("Inside Class A");
		
	}
}

class B2 extends A2{
	int a=11, b=22;
	@Override //annotation
	void display() {
		System.out.println("Inside Class B");
		System.out.println(super.a+ super.b + a+ b);
		super.display();
		
	}
}
class OverridingMembers{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
