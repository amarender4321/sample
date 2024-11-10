package JAVA_programs;

public class SeparatelyPrintEvenOddNumber {

	public static void main(String[] args) {

		
		int a[]= {1,2,3,4,5,6};
		System.out.println("below the array odd");
		for(int e:a) {
			
			if(e/2==0) {
				System.out.print(e+" ");
			}
		}
		System.out.println();
		System.out.println("below the array even");
for(int e:a) {
			
			if(e/2!=0) {
				System.out.print(e+" ");
			}
		}
		
	}

}
