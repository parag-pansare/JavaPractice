package ArrayProblems;

import java.util.Arrays;

public class multiplyLargeThree {

	static int maxProduct(int[] arr) {
		
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return (arr[n-1]*arr[n-2]*arr[n-3]);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,10,7,4,-15};
		
		System.out.println("Multiplication of top 3 elements is : " + maxProduct(arr));

	}

}
