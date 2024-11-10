package NumbersPrograms;

public class PrimeNumber_1_100 {

//	Examples of Prime Numbers:
//		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, etc.
	
	public static void main(String[] args) {

		
		int num=100;
		for(int i=1; i<num; i++) {
			
			boolean isprime=true;
			if(num>1) {
				for(int j=2;j<i; j++) {
					if(i%j==0) {
						isprime=false;
					}
				}
			}
			else {
				isprime=false;
		}
		if(isprime) {
			System.out.print(num+" ");
		}
		
		}
	}

}
