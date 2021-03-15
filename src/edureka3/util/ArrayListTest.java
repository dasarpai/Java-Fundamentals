package edureka3.util;
import java.util.ArrayList;
public class ArrayListTest 
{
 public static void main(String[] args)
 {
  ArrayList<String> names = new ArrayList<String>();
  System.out.println(names + " | Size = "+names.size());
    
  names.add("Sunil");
  names.add("Sunil");
  names.add("Anil");
  names.add("Praveen");
  names.add("Naveen");
  names.add("Pankaj");
  System.out.println(names + " | Size = "+names.size());
  
  names.add(1,"Sagar");
  System.out.println(names + " | Size = "+names.size());
  names.set(2,"Sachin");
  System.out.println(names + " | Size = "+names.size());
  names.add("Sunil");
  System.out.println(names + " | Size = "+names.size());
  
  System.out.println("Element @ index 1 = "+ names.get(1));
  System.out.println("Index of Sunill = "+ names.indexOf("Sunill"));
  System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
  
  System.out.println(names.remove("Sunil"));//true
  System.out.println(names.remove(0));//Sagar
  System.out.println(names + " | Size = "+names.size());
 }
}
