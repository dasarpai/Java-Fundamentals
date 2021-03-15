package edureka3.util;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		 TreeSet<String> names = new TreeSet<>(new MyComparator());
		 
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

class MyComparator implements Comparator<String>
{
	public int compare(String o1, String o2) {
		int n = o1.compareTo(o2);
		System.out.println(o1+" - "+o2+" || "+n);
		
		if(n>0)
		 return -1;
		else if(n<0)
		 return 1;
		else
		 return 0; 	
	} 	
}

