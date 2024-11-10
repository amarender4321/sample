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

//import java.util.*;
//class HelloWorld {
//    public static void main(String[] args) {
//
//String s="welcome to bengalore and welcome to jp nagar";
//String[] sp=s.split(" ");
//LinkedHashSet<Character> set = new LinkedHashSet<>();
//
//for(String word:sp){
//    for(char ch:word.toCharArray()){
//        set.add(ch);
//    }
//}
//System.out.print(set);
//    }
//}