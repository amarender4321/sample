package NumbersPrograms;

public class CountLower_Upper_Number_Space_SpecialChar {

	public static void main(String[] args) {

		String s="this is aeio book 23 #$@ BoX";

		int lower=0, upper=0,space=0,number=0, vowels=0;
		

		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				upper++;
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				lower++;	
			}
			else if(s.charAt(i)==32) {
				space++;
		}
			else if(s.charAt(i)<=48 && s.charAt(i)<=58) {
				number++;
			}
			else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' && s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			vowels++;
			}	
		}
		System.out.println("space is:"+space);
		System.out.println("vowels is"+vowels);
		System.out.println("lower is:"+lower);
		System.out.println("number is:"+number);
		System.out.println("upper is :"+upper);
		System.out.println("sysmbol is :"+(s.length()-space-lower-number-upper));
		
	}

}
