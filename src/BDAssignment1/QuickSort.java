package BDAssignment1;

import java.util.*;
public class QuickSort {
	 int partition(String arr[], int low, int high) 
	 { 
	     String pivot = arr[high];  
	     int i = (low-1); 
	     for (int j=low; j<high; j++) 
	     { 
	         if (arr[j].length() <= pivot.length()) 
	         { 
	             i++; 
	             String temp = arr[i]; 
	             arr[i] = arr[j]; 
	             arr[j] = temp; 
	         } 
	     } 
	
	     String temp = arr[i+1]; 
	     arr[i+1] = arr[high]; 
	     arr[high] = temp; 
	
	     return i+1; 
	 } 
	 
	 void sort(String arr[], int low, int high) 
	 { 
	     if (low < high) { 
	       int pi = partition(arr, low, high); 
	       sort(arr, low, pi-1); 
	       sort(arr, pi+1, high); 
	     } 
	 } 
	 
	//Main Program Body.	
	 public static void main(String args[]) 
	 { 
		 //System.out.println("Insert the size of your array");
		 Scanner inp = new Scanner(System.in);
		 int n = inp.nextInt();
		 Scanner inp1 = new Scanner(System.in);
		 
		 String arr[]=new String[n];
		 //System.out.println("Insert the elements of your array" + arr.length);
		 for(int j=0; j<n; j++)
		 {   //System.out.println(j+ " < "+n);
			 arr[j]= inp1.nextLine(); 			 
		 }	     
		 QuickSort ob = new QuickSort(); 
	     ob.sort(arr, 0, n-1); 
	
	     //System.out.println("sorted array"); 
	     for (int i=0; i<arr.length; i++) {
	    	 System.out.println(arr[i]);
	     }
	     inp.close();
	 } 
} 