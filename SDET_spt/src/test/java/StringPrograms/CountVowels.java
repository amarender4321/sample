package StringPrograms;

public class CountVowels {

	/*public static void main(String[] args) {
String sentance="Ramu is a good boy";
int count =0;
for(int i=0;i<sentance.length();i++) {
char ch = sentance.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	count++;
}
}
System.out.println(sentance+" "+count);
	}

}
*/
//public class CountVowels {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        int count = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
             || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        
        System.out.println("The sentence \"" + sentence + "\" has " + count + " vowels.");
   
        
    
     
    
    
    
    
    
    }
}
