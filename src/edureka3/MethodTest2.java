package edureka3;
public class MethodTest2 {
	static void change(int[] x) {
		for(int i=0;i<x.length;i++) {
			x[i] = x[i]+1;
		}
	}
	
	public static void main(String[] args) {
		int n[] = {10,20,30};
		for(int x : n) {
			System.out.print(x+"  ");
		}
		System.out.println();
		change(n);
		for(int x : n) {
			System.out.print(x+"  ");
		}		
	}

}
