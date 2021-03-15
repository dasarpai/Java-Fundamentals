package edureka3.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) throws InterruptedException
	{
	  HashMap<String,Float> bank = new HashMap<String,Float>();
	  
	  System.out.println(bank.put("Sunil",15000.5f)); //null
	  System.out.println(bank.put("Sunil",11500.5f)); //15000.5	  
	  bank.put("Anil",25000f);
	  bank.put("Rahul",25500f);
	  bank.put("Naveen",45550.5f);
	  
	  System.out.println(bank);
	  
	  float bal = bank.get("Sunil");
	  System.out.println("A/C Balance of Sunil = "+ bal);
	  bal = bal+1150.5f;
	  bank.put("Sunil",bal);
	  System.out.println(bank);
	  
	  System.out.print("A/C Holders :  ");
	  Set<String> keys = bank.keySet();
	  for(String key : keys) {
		  System.out.print(key+" | ");
		  Thread.sleep(1000);
	  }
	  System.out.println();
	  
	  Set<Map.Entry<String,Float>> entries = bank.entrySet();
	  Iterator<Map.Entry<String,Float>> it = entries.iterator();
	  while(it.hasNext()) 
	  {
		  Map.Entry<String,Float> entry = it.next();
		  String name = entry.getKey();
		  Float val = entry.getValue();
		  System.out.println(name+" : "+val);
		  Thread.sleep(1000);
	  }
	}
}
