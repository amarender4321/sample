package StringPrograms;
import java.util.LinkedHashSet;
public class PrintDuplicateWords {

	public static void main(String[] args) {
String s="amar amar";
String[] st = s.split(" ");
LinkedHashSet<String> set= new LinkedHashSet<String>();
for(int i=0;i<st.length;i++) {
	set.add(st[i]);	
}

for(String word:set) {
	int count =0;

for(int j=0;j<st.length;j++) {
	if(word.equals(st[j])) {
		count++;
	}
}
if(count>1) {
	System.out.println(word+" "+count);
}
	}

}
}
