package NumbersPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=161;
		int original_Number=num;
		int rev=0;
		while(num!=0) {
	rev=	rev*10+num%10;
	num=num/10;
	
		}
		if(original_Number==rev) {
			System.out.println("palindrome number is " +rev);
		}
		else {
			System.out.println("is not a palidrome number " +rev );
		}
	}
}
