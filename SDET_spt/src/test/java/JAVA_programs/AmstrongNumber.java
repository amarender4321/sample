package JAVA_programs;

import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int	num=scanner.nextInt();
		scanner.close();
		
		int orginalNum=num;
		int cubeNum=0;
		
		while(num>0) {
			int	reminder=num%10;
			cubeNum=cubeNum+(reminder*reminder*reminder);
			num=num/10;
		}
		if(orginalNum==cubeNum) {
			System.out.println("Amstrong number"+cubeNum);
		}
		else {
			System.out.println("Not a Amastrong number");
		}
	}

}
