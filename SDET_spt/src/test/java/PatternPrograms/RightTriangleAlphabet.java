package PatternPrograms;

public class RightTriangleAlphabet {

	public static void main(String[] args) {
		int letter=65;

		for(int i=0; i<5; i++){
		  for(int j=0; j<i; j++){
		    System.out.print((char)(letter+j)+" ");
		  }
		  System.out.println();
		}
	}

//A 
//A B 
//A B C 
//A B C D 
}
