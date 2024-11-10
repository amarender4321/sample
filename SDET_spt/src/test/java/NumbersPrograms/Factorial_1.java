package NumbersPrograms;

import java.util.Scanner;

public class Factorial_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num =scanner.nextInt();
		scanner.close();
		int fact = factoral(num);
		System.out.println("factorial of the given number "+num+" is:"+fact);
	}
	private static int factoral(int n) {

		if(n==0) {
			return 1;
		}
		else {
			return n*factoral(n-1);
			
		}
	}
}

