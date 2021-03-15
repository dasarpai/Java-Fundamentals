package edureka3;

public class WrapperTest1 {

	public static void main(String[] args) 
	{
   	  int n1 = 25;
	  Integer n2 = n1; //boxing
	  int n3 = n2; //unboxing
	  System.out.println(n1+" | "+n2+" | "+n3);
	  
	  Integer i1 = Integer.valueOf(12);
	  Integer i2 = Integer.valueOf(13);
	  Integer i3 = i1+i2;
	  System.out.println(i3);
	  
	  Float f=Float.valueOf(12.34f);
	  byte b = f.byteValue();
	  short s = f.shortValue();
	  int n = f.intValue();
	  long l = f.longValue();
	  System.out.println(b+" | "+s+" | "+n+" | "+l);
	  
	  float fl = f.floatValue();
	  double d = f.doubleValue();
	  System.out.println(fl+" | "+d);
	}
}
