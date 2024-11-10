package JAVA_programs;

public class ReverseSamePossionString {

	public static void main(String[] args) {
String s = "i am from india";
        
        // Split the string into words
        String[] str = s.split(" ");

        // Loop through each word
        for (int i = 0; i < str.length; i++) {
            // Get the current word
            String word = str[i];
            
            // Reverse the characters of the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            
            // Print a space after each word
            System.out.print(" ");
        }

	}

}
