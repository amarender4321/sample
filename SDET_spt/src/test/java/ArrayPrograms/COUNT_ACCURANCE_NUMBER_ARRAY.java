package ArrayPrograms;

import java.util.LinkedHashSet;
public class COUNT_ACCURANCE_NUMBER_ARRAY {

	public static void main(String[] args) {

		int [] a= {8,2,3,7,5,5,7,7};

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<a.length; i++){
			set.add(a[i]);
		}
		for(Integer it:set){
			int count =0;
			for(int j=0; j<a.length; j++){
				if(it==a[j]){
					count++;
				}
			}
		
			System.out.println(it+"===="+count);
		
	}
	}
}
