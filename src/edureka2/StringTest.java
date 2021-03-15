package edureka2;
public class StringTest 
{
 public static void main(String[] args) 
 {
   String s1 = "edureka";
   String s2 = "edureka";
   System.out.println(s1 == s2); //true
   
   String s3 = new String("edureka");
   String s4 = new String("edureka");
   System.out.println(s3 == s4); //false
   
   System.out.println(s3.equals(s4)); //true
   System.out.println(s3.contentEquals(s4));//true
   System.out.println(s3.equalsIgnoreCase(s4));//true
   
   s1=s1.concat("blr");
   System.out.println(s1);
 }
}
