package edureka3.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap {

	public static void main(String[] args) throws InterruptedException 
	{
	 //HashMap<String,Float> bank = new HashMap<String,Float>();
	 LinkedHashMap<String,Float> bank = new LinkedHashMap<String,Float>();
		
	 System.out.println(bank.put("Sunil",25550f));
	 System.out.println(bank.put("Sunil",11500.5f));
	 
	 
	 System.out.println(bank.put("Anil",50000f));
	 bank.put("Rahul",45000f);
	 bank.put("Naveen",28000f);
	 bank.put("Praveen",28000f);
	 System.out.println(bank);
	 
	 float bal = bank.get("Sunil");
	 System.out.println("A/C Balance of Sunil = "+ bal);
	 bal = bal+1150.5f;
	 bank.put("Sunil",bal);
	 System.out.println(bank);
	 System.out.println();
	 
	 System.out.print("Account Holders: ");
	 Set<String> names = bank.keySet();
	 for(String name : names) {
		 System.out.print(name+" | ");
	 }
	 System.out.println("\n");
	 
	 Set<Map.Entry<String,Float>> entries = bank.entrySet();	 
	 Iterator<Map.Entry<String,Float>> it = entries.iterator();
	 while(it.hasNext()) 
	 {
		 Map.Entry<String,Float> entry = it.next();
		 String key = entry.getKey();
		 float val = entry.getValue();
		 System.out.println(key+" : "+val);
		 Thread.sleep(1000);
	 }
	}
}
