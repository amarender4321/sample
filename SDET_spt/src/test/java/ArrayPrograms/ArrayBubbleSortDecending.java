package ArrayPrograms;

public class ArrayBubbleSortDecending {

	public static void main(String[] args) {
		int a[]={1,4,6,8,3,9,6};
		for(int i=0; i<a.length; i++){
		    for(int j=i+1; j<a.length; j++){
		        if(a[i]<a[j]){
		            
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		for(int i=0; i<a.length; i++){
		    System.out.println(a[i]);
		}
	}

}
