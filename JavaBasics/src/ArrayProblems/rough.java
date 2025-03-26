package ArrayProblems;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 3};
		int n = arr.length;
		
		int[] freq = new int[n + 1]; 
        int repeating = -1;
        int missing = -1;

        // Find the frequency of all elements.
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;     
        }
	}

}
