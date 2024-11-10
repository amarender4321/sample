package JAVA_programs;

public class ReverseStringSamePossition {

	public static void main(String[] args) {

		String s= "aab bbd ccd";
		String[] sp=s.split(" ");
		
	String	reversewords ="";
	
	for(String st:sp) {
		StringBuilder sb= new StringBuilder(st);
		sb.reverse();
		reversewords=reversewords+sb.toString()+" ";
	}

	System.out.println(reversewords);
	}

}

//Reverse the String at same position	

//		String s="i am from india";
//		String[] sp = s.split(" ");
//		for(int i=0; i<sp.length; i++) {
//			char[] ch = sp[i].toCharArray();
//			for(int j=ch.length-1; j>=0;j--) {
//				System.out.print(ch[j]);
//			}
//			System.out.print(" ");
//		}