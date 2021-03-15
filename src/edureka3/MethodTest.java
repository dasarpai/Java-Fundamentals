package edureka3;
public class MethodTest {
	static void addNum(int x, int y) {
		System.out.println("Sum of Integers = "+ (x+y));
	}
	static void addNum(double x, int y) {
		System.out.println("Sum of double, int = "+ (x+y));
	}	
	static float addNum(float x, float y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		addNum(11,22);
		addNum(10.5,12);
		System.out.println("Sum of floats = "+ addNum(10.6f,11.2f));
	}

}
