package JAVA_programs;

import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {

		String s= "amarender amarender";
	String[]	sp=s.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	for(int i=0;i<sp.length;i++) {
		set.add(sp[i]);
	}
for(String word:set) {
	int count =0;

for(int j=0;j<sp.length;j++) {
	
if(word.equals(sp[j]))	{
	count++;
}
		
	}
if(count==1) {
	System.out.println(word+" "+count);
}
}
	
	}
}















