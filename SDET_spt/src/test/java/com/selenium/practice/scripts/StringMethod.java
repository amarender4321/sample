package com.selenium.practice.scripts;

public class StringMethod {

	public static void main(String[] args) {

		
		String a="Amar";
		String b="amar";
		String c="amar";
		
		System.out.println(a.equals(b));  //false
		System.out.println(b.equals(c));  //true
		
		System.out.println(("Amar").equals("amar"));  //false
		System.out.println(("amar").equals("amar"));  //false
	}

}
