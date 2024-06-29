package JAVA_programs;

import java.util.Scanner;

public class AreaCircumtance {

	public static void main(String[] args) {
final double pie=3.14;

Scanner s1= new Scanner(System.in);
System.out.println("Enter the radius");
int r=s1.nextInt();
double c=(pie*r*r);
System.out.println("The output is "+c);
	}

}
