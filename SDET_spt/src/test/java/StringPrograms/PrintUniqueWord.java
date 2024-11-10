package StringPrograms;
import java.util.*;
public class PrintUniqueWord {

	public static void main(String[] args) {
String s="welcome to btm layout welcome to bel layout";
String[] st = s.split(" ");
LinkedHashSet<String> set = new LinkedHashSet<String>();
for(int i=0;i<st.length;i++) {
	set.add(st[i]);
}

for(String ch:set) {
	int count=0;
	for(int j=0;j<st.length;j++) {
		if(ch.equals(st[j])) {
			count++;	
		}
	}
	if(count==1) {
	System.out.println(ch+"----"+count);
}
	}
}
}
