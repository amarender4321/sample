package JAVA_programs;

public class Max_Min_Array {

	public static void main(String[] args) {

		int a[]= {1,2,4,67,87,3,23,9,8};

		int max = a[0];
		int min=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
			max=a[i];
			}
		}
		for(int i=0; i<a.length; i++) {
			if(min>a[i]) {
			min=a[i];
			}
	}
		System.out.println(max);
		System.out.println(min);
}
}