package CollectionsPrograms;

import java.util.HashMap;

public class DuplicateCharacter_1 {

	public static void main(String[] args) {
		String s="amarender";
		char[]	sp=s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c:sp) {
			if(map.containsKey(c)) {
				int	x=	map.get(c);
				map.put(c, x+1);
			}
			else {
				map.put(c, 1);
			}
		}
		for(Character c:map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c+": "+map.get(c));

			}
		}
	}

}
