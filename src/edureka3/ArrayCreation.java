package edureka3;
public class ArrayCreation {

	public static void main(String[] args) {
		//int[] marks = new int[6];
		int[] marks = null;

		marks[0] = 96;
		marks[1] = 85;
		System.out.println("Size of Array = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"  ");
		}
		System.out.println();
		
		boolean []status = new boolean[8];
		for(boolean x : status) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		String names[] = new String[7];
		for(String name : names) {
			System.out.print(name+"   ");
		}
		
	}

}
