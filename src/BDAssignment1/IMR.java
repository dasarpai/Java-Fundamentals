package BDAssignment1;
//Immediate Reporting Manager

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IMR
{
	public IMR() {root = null;}
	static int counter=1;
    public class Node1{
	    public int iData;         
	    public double dData;   
	    public Node1 leftChild; 
	    public Node1 rightChild;   
	    
	    public void displayNode() {
	          System.out.print('{');
	          System.out.print(iData);
	          System.out.print(", ");
	          System.out.print(dData);
	          System.out.print("} ");
	    }
	} 
    private Node1 root;
    public Node1 find_parent(int key) {
    	  Node1 current = root;               
          while(current.iData != key){                         
                     Node1 prev = current;   
                     if(key < current.iData)         
                        current = current.leftChild;
                     else                            
                        current = current.rightChild;
                     
                     if(current == null)             
                        return null;                 
                     
                     if (current.iData==key){
                    	 return prev;
                     }
          }
          return current; 
    }
	public void insert(int id, double dd)
	{
	      Node1 newNode = new Node1();
	      newNode.iData = id; 
	      newNode.dData = dd;
	      if(root==null)     
	         root = newNode;
	      else{   
	    	 Node1 current = root;    
	         Node1 parent;
	         while(true)
	            {
	                parent = current;
	                if(id < current.iData){
	                       current = current.leftChild;
	                       if(current == null){
	                    	   parent.leftChild = newNode;
	                           return;
	                       }
	                   }
	                else{
	                       current = current.rightChild;
	                       if(current == null){ 
	                    	   parent.rightChild = newNode;
	                           return;
	                       }
	               }
	            }
	      }
	}
    public void displayTree(){
      Stack globalStack = new Stack();
      globalStack.push(root);
      int nBlanks = 32;
      boolean isRowEmpty = false;
      System.out.println("############");
      while(isRowEmpty==false){
         Stack localStack = new Stack();
         isRowEmpty = true;
         for(int j=0; j<nBlanks; j++)
        	 System.out.print(' ');
                 
         while(globalStack.isEmpty()==false){
            Node1 temp = (Node1)globalStack.pop();
            if(temp != null){
                   System.out.print(temp.iData);
                   localStack.push(temp.leftChild);
                   localStack.push(temp.rightChild);
                   if(temp.leftChild != null || temp.rightChild != null)
                             isRowEmpty = false;
            }
            else{
                   System.out.print("--");
                   localStack.push(null);
                   localStack.push(null);
            }
            for(int j=0; j<nBlanks*2-2; j++)
                  System.out.print(' ');
         }
  
         System.out.println();
         nBlanks /= 2;
         while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );           
      }
      System.out.println("################");
  }  
    public static void main(String[] args) throws IOException{
          int value;
          IMR theTree = new IMR();
          Scanner in = new Scanner(System.in);
          //System.out.print("How Many Digits: ");
          int howmany = in.nextInt();
          //System.out.print("Enter value to find: ");
          int findwhat = in.nextInt();
          
          //System.out.print("Enter "+ howmany + " value for the tree");
          for (int i=0; i<howmany; i++)
        	  theTree.insert(in.nextInt(), i);
          
          //theTree.displayTree();
          
          //System.out.println("Find :"+ findwhat);
          
          Node1 found1 = theTree.find_parent(findwhat);
          if(found1 != null){
            //System.out.print("Parent of "+ findwhat + " is ");
    	  	System.out.print(found1.iData);
    	  }
          else
            System.out.println("Employee Not Found");
   }
}