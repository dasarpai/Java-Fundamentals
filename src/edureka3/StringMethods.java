package edureka3;
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka";
		System.out.println("Size = "+str.length());
		System.out.println("\"e\" @ index "+ str.indexOf("e"));
		System.out.println("Last Index of \"e\" =  "+ str.lastIndexOf("e"));
		System.out.println("char at 0 = "+ str.charAt(0));
		System.out.println(str.replace('e', '*'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(2,5)); 
		System.out.println(str);
	}
}
