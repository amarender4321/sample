package JAVA_programs;

public class PalindromeString {

	public static void main(String[] args) {

		
		String s="madam";
		
		String rev="";
		
char[]	sp=	s.toCharArray();

for(int i=sp.length-1; i>=0; i--) {
rev	=rev+sp[i];
}
System.out.println(rev);
	}

}
