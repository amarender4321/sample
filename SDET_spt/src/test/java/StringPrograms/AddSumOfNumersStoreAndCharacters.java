package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class AddSumOfNumersStoreAndCharacters {

	public static void main(String[] args) {
		String input="1234amarender";

        int sum = 0;
        List<Character> characters = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            } else if (Character.isLetter(ch)) {
                characters.add(ch);
            }
        }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Characters: " + characters);
	}
}
