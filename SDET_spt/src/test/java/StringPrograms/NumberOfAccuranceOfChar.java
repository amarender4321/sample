package StringPrograms;

import java.util.*;
public class NumberOfAccuranceOfChar {

	public static void main(String[] args) {

		String s = "welcome to bengaluru and welcome to BEL layout";
		String[] sp = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) 
		{
		set.add(sp[i]);
		}
		for (String word : set) 
		{
		int count=0;
		for (int i = 0; i < sp.length; i++) 
		{
		if(word.equals(sp[i]))
		{
		count++;
		}
		}
		System.out.println(word+" "+count);
		}


	}

}
