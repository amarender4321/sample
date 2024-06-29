package JAVA_programs;
import java.util.*;
public class RemoveDuplicateChar {

	public static void main(String[] args) {
String s="amar";
LinkedHashSet<Character> set = new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++) {
	set.add(s.charAt(i));
}
System.out.println(set);
	}
}