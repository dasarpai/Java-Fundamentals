package edureka1;

public class A {
   int a=10, b=10;
   void displayAB() {
	   System.out.println("Inside class A:"+a+" | "+b);
   }
}

class B extends A{
	int c=30, d=40;
	void displayC() {
		System.out.println("Inside class B:"+c+" | "+d);
	}
	
}

class InheritanceTest1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		System.out.println("obj a:"+obj.a+" | obj b:"+obj.b +" | obj c:"+ obj.c + "| obj d:"+ obj.d);
	}

}
