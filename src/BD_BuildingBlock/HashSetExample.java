package BD_BuildingBlock;

import java.util.*;
public class HashSetExample 
{   
    public static void main(String[] args)  
    {   
    	HashSet<String> h = new HashSet<String>(); 
    	  
        // Adding elements into HashSet usind add() 
        h.add("Adam"); 
        h.add("Steve"); 
        h.add("Peter"); 
        h.add("Steve");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains Adam or not:" + 
                           h.contains("Adam")); 
	    
	    // Removing items from HashSet using remove() 
        h.remove("Steve"); 
        System.out.println("List after removing Steve:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());   
    }   
    
}