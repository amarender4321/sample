package NumbersPrograms;

import java.util.Scanner;

public class FibanaccisSeries {

	public static void main(String[] args) {
		
		
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=10;i++) {
			sum=n1+n2;
		
		System.out.print(" "+sum);
		// adding commit
		n1=n2;
		n2=sum;
		}
	}
	

}
