package BDAssignment1;



import java.util.Scanner;
public class RemoveDuplicates  {	    
	int modCount;
 	int size;
 	Node after ;
 	Node before ;
 	Node first ;
 	Node last ;
 
	public boolean add(String o)	{
	   addLastNode(new Node(o));
	   return true;
	}
	 
	private static final class Node {
		     String data;
		     Node next;
		     Node previous;
		     Node (String data) {
		       this.data = data;
		     }
	   } 
	   
	private void addLastNode(Node e)  {
	     modCount++;
	     if (size == 0)
	       first = last = e;
	     else
	       {
	         e.previous = last;
	         last.next = e;
	         last = e;
	       }
	     size++;
	   }
	 
	 public int size(){
	     return size;
	 }
	 
	 public String get(int index) {
	    checkBoundsExclusive(index);
	    return getNode(index).data;
	 }
	 
	 private void checkBoundsExclusive(int index){
	     if (index < 0 || index >= size)
	      throw new IndexOutOfBoundsException("Index: " + index + ", Size:"
	                                           + size);
     }
	  
	 Node getNode(int n) {
	    Node e;
	    if (n < size / 2) {
	       e = first;
	       // n less than size/2, iterate from start
	       while (n-- > 0)
	         e = e.next;
	    }
	    else {
	       e = last;
	       // n greater than size/2, iterate from end
	       while (++n < size)
	         e = e.previous;
	    }
	    return e;
	}
	  
	public String remove(int index) {
	   checkBoundsExclusive(index);
	   Node e = getNode(index);
	   removeNode(e);
	   return e.data;
	}
	  
	void removeNode(Node e) {
	   modCount++;
	   size--;
	   if (size == 0)
	      first = last = null;
	   else  {
	      if (e == first) {
	          first = e.next;
	          e.next.previous = null;
	      }
	      else if (e == last) {
	          last = e.previous;
	          e.previous.next = null;
	      }
	      else {
	         e.next.previous = e.previous;
	         e.previous.next = e.next;
	      }
	   }
	}
	  
	public static void print(RemoveDuplicates LL) {
		for(int i=0; i<LL.size(); i++) {
		  System.out.println(LL.get(i));
		}
	}

	public static void main(String[] args) {
		RemoveDuplicates ll = new RemoveDuplicates();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int j=0; j<n; j++) {			
			String s = sc.nextLine();
			ll.add(s);
		}
		sc.close();
		
		//print(ll);
		//System.out.println(" ");
		
		for (int i=0; i<ll.size(); i++) {
			String s = ll.get(i);
			int k=0;
			for (int j=0; j<ll.size(); j++) {
				if ( s.equals(ll.get(j)) ) {
					k++;
					
				}
				if (k==2) {
					ll.remove(j);
				}
			}
			System.out.println(s);
		}
	}
}