package edureka3;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>(1);
		al.add("Java");
		al.add("Python");
		al.add("Hadoop");
		int counter=0;
		for (String c : al) {
			System.out.println(c);
			++counter;
		}
		System.out.println("number of elements "+counter+" size is "+ al.size());
		System.out.println("Index of Python "+ al.indexOf("Python"));
		
		//al.clear();
		//System.out.println("New List "+al);
		
		Object al1 = al.clone();
		System.out.println(al1);
		
		Object [] objArr = al.toArray();
		
		System.out.println(objArr);
		al.remove("Java");
		
		System.out.println(al);
		
				
		
		
	}

}
