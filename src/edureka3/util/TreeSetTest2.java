package edureka3.util;

import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		
		names.add("Anil");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Sachin");
		System.out.println(names);		
		
		names.add(null);
		System.out.println(names);
	}
}