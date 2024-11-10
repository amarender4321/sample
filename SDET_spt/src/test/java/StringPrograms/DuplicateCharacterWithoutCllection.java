package StringPrograms;

public class DuplicateCharacterWithoutCllection {

	public static void main(String[] args) {

String s="amarender";
  
   char[] sp=s.toCharArray();
   
   
	for(int i=0; i<sp.length; i++) {
		
		for(int j=i+1; j<sp.length; j++) {
			
			if(sp[i]==sp[j]) {
				
				System.out.println(sp[i]);
			}
			
	}
}
	}

}
