package JAVA_programs;

public class ReplaceSpaceAndSpecialCharacter {

	public static void main(String[] args) {


		String str="abcCDF 123@#$ ";

		String	str1=str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(str1);

	}
	

}
