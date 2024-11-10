package JAVA_programs;

public class PrimeNumber_1_100 {

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
