package edureka2;
public class ArrayInitialization 
{
 public static void main(String[] args) 
 {
   //int[] marks = {98,76,93,88,74,81};
   int[] marks = new int[]{98,76,93,88,74,81};
   System.out.println(marks.getClass().getName());
   System.out.println(marks instanceof Object);
   
   System.out.println("No of Subjects = "+ marks.length);	
   
   for(int i=0;i<marks.length;i++)
   {
	System.out.println("mark for Subject-"+(i+1)+" = "+ marks[i]);   
   }
   
   System.out.print("Marks Obtained  :  ");
   for(int mark : marks)
   {
	System.out.print(mark+" | ");   
   }
   System.out.println();
   System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
 }
}
