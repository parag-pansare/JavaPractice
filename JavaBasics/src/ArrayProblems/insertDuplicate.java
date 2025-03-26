package ArrayProblems;

import java.util.Arrays;

public class insertDuplicate {

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
		int k = 0;
		int len = arr.length;
		
		int[] result = new int[len*2];
		int index = 0;
		
		for(int i =0; i<len; i++) {
			result[index++] = arr[i];
			
			if(arr[i] == k) {
				result[index++] = k;	
			}
		}
		
		int[] ans = Arrays.copyOf(result, len);
		
		for(Integer i : ans) {
			System.out.print(i + " ");
		}

	}

}
