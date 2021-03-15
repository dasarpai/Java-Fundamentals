package edureka3.util;

import java.util.HashSet;

public class Hashset 
{
 public static void main(String[] args) 
 {
   HashSet<String> names = new HashSet<>();
   
   System.out.println(names.add("Sunil")); //true
   System.out.println(names.add("Sunil")); //false
   
   names.add("Anil");
   names.add("Praveen");
   names.add("Pankaj");
   names.add("Srinivas");
   names.add("Rahul");
   names.add(null);
   System.out.println(names);
 }
}
