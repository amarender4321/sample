package JAVA_programs;
import java.util.*;


public class Practice_1 {

	public static void main(String[] args) {
		
	String s="i am from india";
	
	String[] sp = s.split(" ");

	for(int i=0;i<sp.length;i++) {
		char ch = sp[i].charAt(i);
		for(int j=sp.length-1;j>=0;j--) {
			System.out.print(sp[i]);
		}
		System.out.print(" ");
	}
		
		}
	}

