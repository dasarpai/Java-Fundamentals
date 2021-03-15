package edureka3;
class Parent{
 int a=10,b=20;
 void display() {
	 System.out.println("Inside class A :: "+ a+" | "+b);
 }
}

class Child extends Parent{
 int a=11,b=22;
 @Override
 void display() {
	 System.out.println("Inside class B :: "+ a+" | "+b+" | "+super.a+" | "+super.b);
	 super.display();
 } 	
}

public class OverridingMembers
{
 public static void main(String[] args) 
 {
	 Child obj = new Child();
	 System.out.println(obj.a+" | "+obj.b);
	 obj.display();
	 }
}
