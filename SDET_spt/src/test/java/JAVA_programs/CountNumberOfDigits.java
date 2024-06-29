package JAVA_programs;
import java.util.*;
public class CountNumberOfDigits {

	public static void main(String[] args) {
//int num=1234;
//int count =0;
//while(num>0) {
//num	=num/10;
//count++;
//}
//System.out.println(count);
		String s="i am from india";
        String[] str=s.split(" ");
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        for(int i=0; i<str.length; i++){
        set.add(str[i]);
        }
       
        for(String word:set) {
        int count=0;
   
    for(int j=0; j<str.length;j++){
        if(word.equals(str[j])){
            count++;
        }
    }
    if(count>1){
        System.out.println(word+" "+count);
    }
	}

}
}