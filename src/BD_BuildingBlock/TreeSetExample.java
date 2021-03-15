package BD_BuildingBlock;

import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(33);
		ts.add(11);
		ts.add(33);
		ts.add(1);
		System.out.println(ts);
		ts.remove(33);
		System.out.println("After removing 33 from the list: " +ts);
		System.out.println("Print the size of the set: " +ts.size());
		System.out.println("Print the last element of the set: "+ts.pollLast());
		System.out.println("Print the first element of the set: "+ts.pollFirst());
    }
 } 
