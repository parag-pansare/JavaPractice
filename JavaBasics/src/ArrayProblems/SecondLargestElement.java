package ArrayProblems;

import java.util.Arrays;

public class SecondLargestElement {

	static int getSecondLargest(int[] arr) 
	{
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println("Largest element of array is : " + arr[n-1]);
		for(int i = n-2; i>=0; i--) 
		{
			System.out.println("Current ele is :" + arr[i]);
			if(arr[i] != arr[n-1]) 
			{
				return arr[i];
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 35, 1 };
        System.out.println(getSecondLargest(arr));
	}

}
