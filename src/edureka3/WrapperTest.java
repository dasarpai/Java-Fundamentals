package edureka3;

public class WrapperTest 
{
 public static void main(String[] args) 
 {
	 Integer i1 = new Integer(10);
	 Integer i2 = new Integer("10");
	 System.out.println(i1+" | "+i2);
	 
	 Boolean b1 = new Boolean(true);
	 Boolean b2 = new Boolean("true");
	 System.out.println(b1+" | "+b2);
	 
	 Character c1 = new Character('A');
	 System.out.println(c1);	
	 
	 Integer i3 = Integer.valueOf(10);
	 Integer i4 = Integer.valueOf("10");
	 System.out.println(i3+" | "+i4);
 }
}
