package JAVA_programs;


public class CountEvenAndOdd {

	public static void main(String[] args) {
		
int num =23447777;
int even_count=0;
int odd_count=0;
while(num>0) {
int reminder = num%10;
if(reminder%2==0) {
	even_count++;
}

else {
	odd_count++;
}
num=num/10;
}
System.out.println("even numbers is "+even_count);
System.out.println("odd numbers is "+odd_count);
	}
}
