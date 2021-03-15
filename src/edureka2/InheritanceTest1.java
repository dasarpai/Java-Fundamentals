package edureka2;
class A2{
 int a=10,b=20;
 void displayAB(){
  System.out.println("Inside class A: "+a+" | "+b);
 }
}

class B2 extends A2{
 int c=30, d=40;
 void displayC(){
  System.out.println("Inside class B: "+c+" | "+d);
 }
}

class InheritanceTest1 
{
	public static void main(String[] args) 
	{
		B2 obj = new B2();
		System.out.println(obj.a+" | "+obj.b+" | "+obj.c+" | "+obj.d);
		obj.displayAB();
		obj.displayC();
	}
}
