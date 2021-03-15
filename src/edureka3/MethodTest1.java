package edureka3;
public class MethodTest1 {
	static void change(int n) {
		n = 20;
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(n);
		change(n);
		System.out.println(n);
	}
}
