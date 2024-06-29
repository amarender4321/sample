package JAVA_programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
String s="amar,suri,pandu,pranv";
String str = s.replace(" ", "");
char[] ch = str.toCharArray();
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);	
}
System.out.println(set);

	}

}
