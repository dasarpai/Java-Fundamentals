package edureka3;
import java.util.Arrays;

public class ArrayInitialization 
{
	public static void main(String[] args) 
	{
		//int[] marks = {98,76,93,81,74,63};
		//int []marks = {98,76,93,81,74,63};
		int marks[] = {98,76,93,81,74,63};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject-"+(i+1)+" = "+marks[i]);
		}
		
		/*array iteration using enhanced for loop*/
		System.out.println("Marks Obtained: ");
		
		for(int mark : marks) {
			System.out.print(mark+" | ");
		}
		System.out.println();
		//System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(marks));
	}
}
