package JAVA_programs;

import java.util.*;

public class PrimeNumer_1 {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any number");
//		int	num=scanner.nextInt();
//		scanner.close();
		int num=4;
		boolean isPrimeNumber=true;
		if(num>0) {
			for(int i=2; i<num; i++) {
				if(num%2==0) {
					isPrimeNumber=false;
				}
				else {
					isPrimeNumber=false;
				}
			}
			if(isPrimeNumber) {
				System.out.println(num+" is a primeNumber");
			}
			else {
				System.out.println(num+" is not a primeNumber");
			}

		}
	}

}
