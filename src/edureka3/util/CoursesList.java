package edureka3.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CoursesList {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		HashSet<String> courses = new HashSet<>();
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		 System.out.print("enter course name: ");
		 String name = sc.nextLine();
		 
		 boolean res = courses.add(name);		 
		 if(!res)
			 System.out.println("\""+name+"\" already in list");
		 
		 System.out.print("Next Course Name [Y/N]: ");
		 req=sc.nextLine();
		}
		
		System.out.println("Courses @ Edureka:");
		Iterator<String> it = courses.iterator();
		while(it.hasNext())
		{
		 String name = it.next();
		 System.out.print(name+" | ");
		 Thread.sleep(1000);
		}
		sc.close();
	}

}
