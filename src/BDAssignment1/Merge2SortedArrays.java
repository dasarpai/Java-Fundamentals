package BDAssignment1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Merge2SortedArrays  {
    void sort(Integer[] ar){
        for (int i=0; i<ar.length; i++){
            for (int j=i+1; j<ar.length; j++){
                if (ar[i]<ar[j]) {
                    int k=ar[i];
                    ar[i]=ar[j];
                    ar[j]=k;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        //int a;
        
        // Read the variable from STDIN
        int a = in.nextInt();
        int b = in.nextInt();
        
        Integer[] a1 = new Integer[a];
        for (int i=0; i<a; i++){
            a1[i] = in.nextInt();
        }
        
        
        Integer[] b1 = new Integer[b];
        for (int i=0; i<b; i++){
            b1[i] = in.nextInt();
        }
        
        Integer[] c = new Integer[a+b];
        for (int i=0; i<a; i++){
            c[i]=a1[i];
        }
        
        for (int i=a, j=0; j<b; j++, i++){
            c[i]=b1[j];
        }
        
        Merge2SortedArrays s = new Merge2SortedArrays ();
        s.sort(c);
        
        for (int i=0; i<a+b; i++){
            System.out.println(c[i]);
        }

   }
}