package JAVA_programs;

public class SegerigateString {

	public static void main(String[] args) {

String input= "12ab@!";

String numbers=" ";
String alphaChars=" ";
String specialChars = "";

for(int i=0; i<input.length();i++) {
	char ch = input.charAt(i);
	if(Character.isDigit(ch)) {
	numbers +=ch;
	}
	else if(Character.isAlphabetic(ch)) {
		alphaChars +=ch;
	}
	else {
		specialChars +=ch;	
		
	}
}
System.out.println(specialChars);
System.out.println(numbers);
System.out.println(alphaChars);
	}

}
