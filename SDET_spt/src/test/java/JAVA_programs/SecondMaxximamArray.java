package JAVA_programs;

public class SecondMaxximamArray {

	public static void main(String[] args) {
		
		int arr[] = {12,23,34,56,67,44};
		
		for(int i=0; i<arr.length; i++) {
			int temp;

			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i]<arr[j]) {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			}
			
		}
			if(i==1)break;
		}
		System.out.println(arr[1]);
	}

}
