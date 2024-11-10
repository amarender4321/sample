package JAVA_programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String s = "welcome to bengaluru and welcome to BEL layout";
		String[] sp = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < sp.length; i++) {
		set.add(sp[i]);
		}
		System.out.println(set);
	}

}
