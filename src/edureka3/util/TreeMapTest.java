package edureka3.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<>();
		  System.out.println(bank.put("Sunil",15000.5f)); //null
		  System.out.println(bank.put("Sunil",11500.5f)); //15000.5	  
		  bank.put("Anil",25000f);
		  bank.put("Rahul",25500f);
		  bank.put("Naveen",45550.5f);
		  
		  System.out.println(bank);		
	}

}
