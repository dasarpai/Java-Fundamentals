package edureka3;
public class StringTest {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1==s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false
		
		
		s1.concat("blr");
		//s1 = s1.concat("blr");
		System.out.println(s1);
		System.out.println("s3.equals(s4) ===> "+ s3.equals(s4));
		System.out.println(s1.contentEquals(s2)); //true
		System.out.println("s3.equalsIgnoreCase(s4) ===> "+ s3.equalsIgnoreCase(s4));
	}
}
