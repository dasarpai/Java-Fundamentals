package edureka3;
public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(10/3); //3
		System.out.println(10.0/3);//3.333333....
		System.out.println(10%3); //1
		System.out.println(-10%3); //-1
		System.out.println(10%-3); //1
		System.out.println(-10%-3); //-1
		System.out.println(0/10); //0
		//System.out.println(10/0); //java.lang.ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0/0);// -Infinity
		System.out.println(0.0/0); //NaN
		
		byte b1 = 11;
		byte b2 = 22;
		//byte b3 = b1+b2; //cannot convert from int to byte
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);		
	}
}
