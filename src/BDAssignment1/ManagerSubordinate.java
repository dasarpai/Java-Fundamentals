package BDAssignment1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
import java.util.*;
import java.lang.*;

public class ManagerSubordinate {
	public void sort_print(String[] name, Integer[] age) {
		for (int i=0; i<age.length; i++) {
			for(int j=i+1; j<age.length; j++) {
		     	if (age[i]>age[j]) {
		     		Integer a = age[i];
		     		age[i]=age[j];
		     		age[j]=a;
		     		
		     		String nm= name[i];
		     		name[i]=name[j];
		     		name[j]=nm;
		     		
		     	}
			}
		}
			
		
	}
	public void sort(String[] managers) {
		for(int i=0; i<managers.length; i++) {
			for(int j=i+1; j<managers.length; j++ ){
				if ( managers[i].compareTo(managers[j])>0 ) { 
					String s = managers[j];
					managers[j] = managers[i];
					managers[i] = s;					
				}
			}
		}
	}
	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter M & N ");
		String s = in.nextLine();
		int ind =s.lastIndexOf(" ");
		int M= Integer.parseInt(s.substring(0, ind));
		int N= Integer.parseInt( s.substring(ind+1, s.length()) );
		//System.out.println(M+ " "+N);
		String[] managers = new String[M];
		String[] manager_so_info = new String[N];
		
		//System.out.println("Enter Manager Name");
		for (int i=0; i<M; i++) {
			managers[i]=in.nextLine();			
		}
		
		//System.out.println("Enter Subordinate Details (Manager, SO Name, Age");
		for (int i=0; i<N; i++) {
			manager_so_info[i]=in.nextLine();			
		}
		
		//Sort Managers in Lexiographical order
		ManagerSubordinate msa = new ManagerSubordinate();
		msa.sort(managers);
		
		//For each manager
		for (int i=0; i<M; i++) {
			String[] name;
			//Get Subordinate information of a given manager
			HashMap<String, Integer> so_info = new HashMap<String, Integer>();
			System.out.println(managers[i]);
			
			for (int j=0; j<N; j++) {
				String manager_so_info_ = manager_so_info[j];
				int a1 =manager_so_info_.indexOf(" ");
				String mgr_name= manager_so_info_.substring(0, a1);
				
				manager_so_info_= manager_so_info_.substring(a1+1);
				a1 =manager_so_info_.indexOf(" ");
				String so_name= manager_so_info_.substring(0, a1);
				
				Integer age = Integer.parseInt(  manager_so_info_.substring(a1+1, manager_so_info_.length()) );
				
				if ( mgr_name.equals( managers[i]) ) {
					so_info.put(so_name,age);
				}
			}
			
			Map<String, Integer> so_info1 = sortByValue(so_info);
			for (Map.Entry<String, Integer> en : so_info1.entrySet()) { 
				System.out.println(en.getKey()+ " "+ en.getValue());
			}
		}

	}
}