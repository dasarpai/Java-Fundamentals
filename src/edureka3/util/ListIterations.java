package edureka3.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations
{
	public static void main(String[] args) 
	{
	  ArrayList<Integer> al = new ArrayList<>();
	  for(int i=11;i<=16;i++) 
	  {
		  al.add(i);
	  }
	  System.out.println(al);
	  
	  iterate1(al);
	  separator();
	  
	  iterate2(al);
	  separator();
	  
	  iterate3(al);
	  separator();
	  
	  iterate4(al);
	  separator();
	  
	  iterate5(al);	  
	}
	
	static void iterate1(List<Integer> data) {
		System.out.println("<<<iterate using for loop and get()-only for List");
		for(int i=0;i<data.size();i++) {
			Integer n = data.get(i);
			System.out.print(n+"   ");
		}
	}
	
	static void iterate2(List<Integer> data) {
		System.out.println("<<<iterate using for-each loop");
		for(Integer n : data) {
			System.out.print(n+"   ");
		}
	}
	
	static void iterate3(List<Integer> data) {
		System.out.println("<<<iterate using java.util.Iterator");
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
	}
	
	static void iterate4(List<Integer> data) {
		System.out.println("<<<iterate using java.util.ListIterator- only for List");
		ListIterator<Integer> lit = data.listIterator();
		while(lit.hasNext()) {
			Integer n=lit.next();
			System.out.print(n+"   ");
		}
		separator();
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"   ");
		}
	}
	
	static void iterate5(List<Integer> data) {
		System.out.println("<<<iterate using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(data);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
	}
	
	static void separator() {
		System.out.println();
		try {
			Thread.sleep(1500);
		}
		catch(Exception ex) {}
	}
}
