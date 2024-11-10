package ArrayPrograms;

public class FindMissingElementArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,6};

		int withoutmissingElement=0;
		for(int i=1; i<=6; i++) {
			withoutmissingElement=withoutmissingElement+i;
		}
		int missingtElement=0;

		for(int e:a) {
			missingtElement=missingtElement+e;	
		}
		System.out.println("The missing array element is "+(withoutmissingElement-missingtElement));
	}

}
