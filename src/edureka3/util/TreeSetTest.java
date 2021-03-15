package edureka3.util;

import java.util.TreeSet;

public class TreeSetTest 
{
 public static void main(String[] args) 
 {
	 TreeSet<String> names = new TreeSet<>();
	 System.out.println(names.add("Sunil")); //true
	 System.out.println(names.add("Sunil")); //false
	   
	 names.add("Anil");
	 names.add("Praveen");
	 names.add("Pankaj");
	 names.add("Srinivas");
	 names.add("Rahul");
	 //names.add(null);  
	 System.out.println(names);	 
 }
}
