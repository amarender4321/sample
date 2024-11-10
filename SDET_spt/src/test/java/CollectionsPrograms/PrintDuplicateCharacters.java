package CollectionsPrograms;
import java.util.*;
public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		  String s = "amarender ";
	        
	        char[] sp = s.toCharArray();
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        
	        // Count the occurrences of each character
	        for (char ch: sp) {
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            } else {
	                map.put(ch, 1);
	            }
	        }
	        
	       //  Print only the duplicate characters
	        System.out.println("Duplicate characters:");
	        for (char c : map.keySet()) {
	            if (map.get(c) > 1) {
	                System.out.println(c + ": " + map.get(c));
	            }
	        }
	}

}
