package BDAssignment1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class StringSubset {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S1 = in.nextLine();
		String S2 = in.nextLine();
		
		int counter=0;
		for (int i=0; i<S1.length(); i++) {
			char  c = S1.charAt(i);
			for (int j=0; j<S2.length(); j++) {
				if (S1.charAt(i)== S2.charAt(j)) {
					++counter;
					
				}
			}
		}
		System.out.println(counter);

	}
}
