package JAVA_programs;

import java.util.*;
public class DuplicateElementArrayUsingHasSet {

	public static void main(String[] args) {

		
		int a[]= {2,4,6,8,9,6,2};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			
		if(set.add(a[i])==false){
			System.out.print(a[i]+" ");
	
		}
	}

}
}