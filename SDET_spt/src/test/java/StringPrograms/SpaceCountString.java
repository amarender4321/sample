package StringPrograms;

public class SpaceCountString {

	public static void main(String[] args) {

		String s="a m a r e n d e r";

		int spaceCount =0;

		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)==' ') {
				spaceCount ++;
			}
		}
		System.out.println(spaceCount);
	}
}
