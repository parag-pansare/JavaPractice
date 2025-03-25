package ArrayProblems;

import java.util.Arrays;

public class pushZeroes {

	static void pushZeroesToEnd(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		
		for(int i=0;i<n;i++ ) 
		{
			if(arr[i] != 0) 
			{
				temp[j++] = arr[i];
			}
		}
		while(j<n) 
		{
			temp[j++]=0;
		}	
		
		for(int i=0; i<n; i++) 
		{
			arr[i] = temp[i];
		}
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,0,1,-6,0,0,2,5};
		pushZeroesToEnd(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
