package NumbersPrograms;

import java.util.Arrays;
import java.util.List;

public class FetchOddNumberUsingCollection {

	public static void main(String[] args) {

		List<Integer> al =Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		for(Integer x : al)
		{
			if(x%2!=0){
				System.out.println(x);

			}
		}
	}

}
