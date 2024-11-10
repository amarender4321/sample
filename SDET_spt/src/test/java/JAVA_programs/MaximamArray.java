package JAVA_programs;

public class MaximamArray {

	public static void main(String[] args) {
		  // Hardcoded array
        int[] a = {2, 4, 5, 6, 8};

        // Initialize max with the first element of the array
        int max = a[0];

        // Traverse the array to find the maximum value
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Print the maximum value
        System.out.println("The maximum value in the array is: " + max);
	}

}
