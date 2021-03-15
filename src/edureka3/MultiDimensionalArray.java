package edureka3;
public class MultiDimensionalArray {

	public static void main(String[] args) {
		//int[][] n = new int[5][4];
		
		/* Two dimensional array initialization*/
		int[][] n = {{1,2,3},{4,5},{6,7,8,9}}; 
				
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		for(int i=0;i<n.length;i++) {
			for(int x : n[i]) {
				System.out.print(x+"   ");
			}
			System.out.println();
		}
	}
}
