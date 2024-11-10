package NumbersPrograms;


public class CountEvenAndOdd {

	public static void main(String[] args) {


		int num=12345678;

		int evenNumber=0;
		int oddNumber=0;

		while(num>0) {
			int reminder=	num%10;
			if(reminder%2==0) {
				oddNumber++;
			}
			else {
				oddNumber++;
			}
			num=num/10;

		}
		System.out.println(evenNumber);
		System.out.println(oddNumber);
	}
}
