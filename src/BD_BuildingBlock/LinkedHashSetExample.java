package BD_BuildingBlock;

import java.util.LinkedHashSet;   
public class LinkedHashSetExample  
{   
    public static void main(String[] args)  
    {   
        LinkedHashSet<String> linkedset =  new LinkedHashSet<String>();   
  
        // Adding elements to LinkedHashSet   
        linkedset.add("1");   
        linkedset.add("5");
        linkedset.add("2");   
        linkedset.add("3");   
        linkedset.add("4"); 
         
 
        // 1 will not get added as it already exists  but 7 will be added
        linkedset.add("1");  
        linkedset.add("7"); 
	    
	    System.out.println("Size of LinkedHashSet = " + linkedset.size());   
	    System.out.println("Original LinkedHashSet:" + linkedset);   
        System.out.println("Removing 4 from LinkedHashSet: " + linkedset.remove("4"));   
        System.out.println("Trying to Remove 10 which is not "+ "present: " + linkedset.remove("10"));   
        System.out.println("Checking if 1 is present=" + linkedset.contains("1")); 
        System.out.println("Updated LinkedHashSet: " + linkedset);   
    }   
} 
