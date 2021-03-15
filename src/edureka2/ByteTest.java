package edureka2;
public class ByteTest {

	public static void main(String[] args) 
	{
	  byte b = -128;	
	  System.out.println(b);
	  
	  b = 28;
	  System.out.println(b);
	  
	  b = 127;
	  System.out.println(b);
	  
	  //b = 128; //Type mismatch: cannot convert from int to byte
	  b = (byte)128;
	  System.out.println(b);
	  
	  b = (byte)500;
	  System.out.println(b); //-12	  
	}
}
