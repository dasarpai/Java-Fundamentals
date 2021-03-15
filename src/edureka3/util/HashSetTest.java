package edureka3.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest 
{
	public static void main(String[] args) 
	{
		HashSet<String> names = new HashSet<>();
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		
		names.add("Anil");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Sachin");
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(null);
		System.out.println(names);
	}
}
