package StringPrograms;

import java.util.*;
public class FetchEachWordLastSecondCharacter {

	public static void main(String[] args) {
		  String input = "Welcome to Java";
	        
	        // Create a map with specific transformations
	        Map<Character, Character> map = new HashMap<>();
	        map.put('v', 'm');
	        map.put('t', 't');
	        map.put('m', 'v');
	        
	        StringBuilder output = new StringBuilder();
	        
	        // Traverse the input string
	        for (char c : input.toCharArray()) {
	            // Check if the character exists in the map
	            if (map.containsKey(c)) {
	                output.append(map.get(c));
	            }
	        }
	        
	        // Print the input and output
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output.toString());
	}

}
