package StringPrograms;

public class ReverseStringMiddleWord {

	public static void main(String[] args) {
		 String input = "keep forward always";
	        String[] words = input.split(" ");

	        // Check if there are at least two words
	        if (words.length >= 2) {
	            String secondWord = words[1];
	            String reversedSecondWord = "";

	            // Reverse the second word using a simple loop
	            for (int i = secondWord.length() - 1; i >= 0; i--) {
	                reversedSecondWord += secondWord.charAt(i);
	            }

	            words[1] = reversedSecondWord; // Replace the second word with its reverse
	        }

	        // Join the words back into a single string
	        String result = "";
	        for (String word : words) {
	            result += word + " ";  // Add a space after each word
	        }

	        result = result.trim();  // Remove trailing space
	        System.out.println(result);  // Output: keep drawrof always
	}
}
