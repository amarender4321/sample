package NumbersPrograms;

public class OneToHundredPrimerNumbers {

	public static void main(String[] args) {
		int n= 100;
		for(int i=1; i<=n;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=1;
				}
			}
		
		if(temp==0) {
			System.out.println(i);
			
		}
		else {
			temp=0;
		}
	}
	}

}
