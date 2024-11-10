package ArrayPrograms;

public class DuplicateElementsUseingArrayIndex {

	public static void main(String[] args) {

		int a[]= {2,4,4,6,8,9,3,3};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.print(a[i]+" ");
				}
		
				
			
			
		}
		
	}

}
}