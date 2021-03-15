package edureka3.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		
		names.add("Anil");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Sachin");
		System.out.println(names);
	}
}
