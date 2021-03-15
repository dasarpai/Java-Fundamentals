package edureka3;
public class StringCreations 
{
 public static void main(String[] args) 
 {
	 String s1 = "NIT";
	 String s2 = "NIT";
	 System.out.println(s1 == s2); //true
	 
	 String s3 = new String("Java");
	 String s4 = new String("Java");
	 System.out.println(s3 == s4); //false
	 
	 System.out.println(s1 == s3); //false
 }

}
