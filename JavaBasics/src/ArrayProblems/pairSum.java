package ArrayProblems;

import java.util.HashSet;

public class pairSum {

	static void painInSortedArray(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=-0; i<arr.length; i++) {
			
			int complement = target -arr[i];
			
			if(set.contains(complement)) {
				System.out.println("Two numbers are : " + complement + " & " + arr[i]);
			}
			set.add(arr[i]);
		}
		System.out.println("Pair sum equalling target is not present");
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;
        
        painInSortedArray(arr, target);
        	
        

	}

}
