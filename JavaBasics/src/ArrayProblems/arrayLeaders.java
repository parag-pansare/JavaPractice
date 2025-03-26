package ArrayProblems;

import java.util.ArrayList;

public class arrayLeaders {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2,5,12,2,7 };
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int j=0;
			for(j=i+1; j<n; j++) {
				if(arr[i] < arr[j]) {
					break;
				}
			}
			if(j==n) {
				arrlist.add(arr[i]);
			}	
		}
		
		for( Integer i : arrlist) {
			System.out.print(i + " ");
		}
		
	}

}
