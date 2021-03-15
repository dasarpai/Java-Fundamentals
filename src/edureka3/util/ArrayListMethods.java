package edureka3.util;

import java.util.ArrayList;

public class ArrayListMethods 
{
 public static void main(String[] args) 
 {
   ArrayList<String> names = new ArrayList<String>();
   System.out.println(names+" | Size="+names.size());
   
   names.add("Sunil");
   names.add("Rehman");
   names.add("Manoj");
   names.add("Mohit");
   names.add("Prabhu");
   names.add("Priojit");
   names.add("Sunil");
   names.add("Sunil");
   System.out.println(names+" | Size="+names.size());
   
   names.add(1,"Naveen");
   names.set(7, "Joseph");
   System.out.println(names+" | Size="+names.size());
   System.out.println("Sunil @ "+ names.indexOf("Sunil"));
   System.out.println("Last position of Sunil @ "+names.lastIndexOf("Sunil"));
   System.out.println("Person @ 2 = "+ names.get(2));
   
   System.out.println(names.remove("Sunil"));
   System.out.println("Element Removed = "+ names.remove(7));
   System.out.println(names+" | Size="+names.size());
   System.out.println(names.contains("Sunil"));
 }
}
