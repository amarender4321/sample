package JAVA_programs;

import java.util.Scanner;

public class FibonacciSeries_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =scanner.nextInt();
		
		scanner.close();
		int a=1,b=1;

		System.out.print(a+" ");
		System.out.print(b+" ");
	//	System.out.print("1 1");
	
		int f=0;
		
		while(f<=num) {
			f=a+b;
			if(f>num)
				break;
			
			System.out.print(f+ " ");
			a=b;
			b=f;
		}
	}
	
}

