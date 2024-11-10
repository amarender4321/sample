package StringPrograms;

public class ReverseSamePossitionString {

	public static void main(String[] args) {
		 String str = "i am from india"; 
	        String[] words = str.split(" ");  // Splitting the string into words
	        
	        for (int i = 0; i < words.length; i++) { 
	            // Loop through each word and reverse it
	            for (int j = words[i].length() - 1; j >= 0; j--) { 
	                System.out.print(words[i].charAt(j)); 
	            } 
	            System.out.print(" ");  // Add space after each reversed word
	        }

	}

}
