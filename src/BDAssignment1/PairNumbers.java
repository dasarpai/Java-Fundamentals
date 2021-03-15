package BDAssignment1;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted
public class PairNumbers  {
	
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] num = new int[n];
		
		for (int i=0; i<n; i++) {
			num[i] = inp.nextInt();
		}
		
		HashMap<String, Integer>  hm = new HashMap<String, Integer>();
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (num[i]!=num[j])
					hm.put("("+ Math.min(num[i],num[j])+ ", "+ Math.max(num[i],num[j]) +")", num[i]*num[j]);
			}
		}
				
		Set<Entry<String, Integer>>      es  = hm.entrySet();
		Iterator<Entry<String, Integer>> itr = es.iterator();
		
		HashMap<String, Integer> dup = new HashMap<String, Integer>();

		while (itr.hasNext() ){

			StringBuilder sb = new StringBuilder();
			
			Entry<String, Integer> en = itr.next();
			String key = en.getKey();
			Integer val = en.getValue();
			
			Set<Entry<String, Integer>>      es1  = dup.entrySet();
			Iterator<Entry<String, Integer>> itr1 = es1.iterator();			
			if (dup.containsValue(val)) {
				String key2="";
				while (itr1.hasNext()) {
					Entry<String, Integer>   en1  = itr1.next();
					if (en1.getValue()==val) {
						key2 = en1.getKey();
						sb.append(key2);
					}
				}
				System.out.println(key + " and "+ sb);
			}
			else {
				dup.put(key, val);
			}
		}
		inp.close();
	}
}
