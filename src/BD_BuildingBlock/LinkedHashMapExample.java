package BD_BuildingBlock;

import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) 
    {
        System.out.println("LinkedHashMap ");
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(29, "India");
        map.put(16, "Germany");
        map.put(50, "USA");
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getValue() + " has a total of " + m.getKey() + " States ");
        }
    }
}