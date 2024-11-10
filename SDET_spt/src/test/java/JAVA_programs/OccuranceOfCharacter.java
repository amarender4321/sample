package JAVA_programs;

import java.util.LinkedHashSet;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
String s= "amarender";
char[] ch = s.toCharArray();
LinkedHashSet<Character> set= new LinkedHashSet<Character>();
for(int i=0; i<ch.length;i++) {
	set.add(ch[i]);	
}
for(Character cha:set) {
	int count =0;
	for(int j=0; j<ch.length;j++) {
		if(cha==ch[j]) {
			count++;
			
		}
		
	}
	if(count==1);
	System.out.println(cha+" "+count);
}
	}

}
