package edureka1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Happy";
		System.out.println(s1.concat(" Learning"));
		s1= s1.concat(" You are awesome");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.substring(3,8));
		String s2= "H";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		int a=50;
		String s= String.valueOf(a);
		System.out.println(s);
		
		String s3="Hello";
		System.out.println(s3.replace("l","d"));
		
		System.out.println( s3.contains("h"));
		
		System.out.println(s3.endsWith("o"));
		
		System.out.println(s3.charAt(3));
		
		StringBuffer sb= new StringBuffer("Welcome to Vedavit");
		sb.append(" Happy Learning");
		System.out.println(sb);
		
		sb.insert(0,"Ok");
		System.out.println(sb);
		
		sb.replace(0, 3, "Namaste");
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());

	}

}
