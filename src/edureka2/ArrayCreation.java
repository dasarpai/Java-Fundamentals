package edureka2;
public class ArrayCreation 
{
 public static void main(String[] args) 
 {
   int[] n = new int[7];
   n[0] = 12;
   n[1] = 34;
   System.out.println("Size of Array = "+ n.length);
   for(int i=0;i<n.length;i++) {
	   System.out.print(n[i]+"   ");
   }
   System.out.println();
   
   double[] data = new double[5];
   System.out.println(data.getClass().getName());
   for(double d : data) {
	   System.out.print(d+"   ");
   }
   System.out.println();
   
   
   Employee3 emp[] = new Employee3 [5];
   System.out.println(emp.length);
   for(int i=0; i<emp.length; i++)
	   {
	   emp[i].setDetails(i);
	   System.out.print("employee no: "+emp[i].empno);
   }
   System.out.println();
   
   
   boolean status[] = new boolean[6];
   for(boolean stat : status) {
	   System.out.print(stat+"   ");
   }
   System.out.println();
   
   String[] names = new String[10];
   for(String name : names) {
	   System.out.print(name+"   ");
   }
 }
}
