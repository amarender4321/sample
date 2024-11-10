package StringPrograms;

public class LeftSideFetchSecondLetter {

	public static void main(String[] args) {
//		 String input = "Welcome to Java";
//	        String[] words = input.split(" ");
//	        String result = "";  // Using a String to accumulate the result
//
//	        for (String word : words) {
//	            result += word.charAt(0); // Appending the first letter of each word
//	        }
//
//	        System.out.println(result);
		
		
	     String str = "welcome to java";
	     //   String[] words = str.split(" ");      //["welcoMe", "To", "jaVa" ]
	        String result = " ";
	        
	        for(int i = str.length() -1; i>=0; i--) {
	        	if(str.length() >= 2) {
	        		result += str.charAt(i);
	        	}
	        }
	        
	      //  System.out.println(result);
	        System.out.println();
	        String[] words = result.split(" ");
	        String finalResult = " ";
	        for(int i = 0; i<words.length ; i++) {
	        	if(words[i].length() >= 2) {
	        		finalResult += words[i].charAt(1);
	        	}
	        }
	        System.out.println(finalResult);
	}

}
