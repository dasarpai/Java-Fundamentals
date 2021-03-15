package edureka3;
public class StaticTest 
{
 static String name="edureka";	
 static {
	 System.out.println("Application designed & developed by");
	 System.out.println("static block-1");
 }
 public static void main(String[] args) 
 {
	 System.out.println("MAIN METHOD");
 }
 static {
	 System.out.println("team @ NITR");
	 System.out.println("static block-2");
 }
}
