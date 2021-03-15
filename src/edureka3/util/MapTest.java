package edureka3.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Float> bank= new HashMap<String, Float>();
		System.out.println(bank.put("Sunil",15000.5f));
		System.out.println(bank.put("Sunil",11500.5f));
		float bal= bank.get("Sunil");
		bank.put("Sunil",  bal);
		System.out.println("Sunil "+ bal);
		
		Set<String> keys= bank.keySet();
		for (String key: keys) {
			System.out.println(key+ " | ");
		}
		
		System.out.println();
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>>  it= entries.iterator();
		
		

	}

}
