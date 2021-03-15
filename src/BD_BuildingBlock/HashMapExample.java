package BD_BuildingBlock;

import java.util.*;
public class HashMapExample
{
    public static void main(String[] args) 
    {
          Map<Integer,String> map= new HashMap<Integer,String>(); 
          map.put(29,"Rahul");
          map.put(18,"Rishabh");  
          map.put(45,"Rohit"); 
          //map.put(45, "Sanjay");
          System.out.println(map); 
          for(Map.Entry m:map.entrySet())
          {  
                System.out.println("Age of "+m.getValue()+" is "+m.getKey()+" years ");
          }  
    }  
}