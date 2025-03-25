package ArrayProblems;

import java.util.Arrays;

public class leftRotate {
	
	static void rotateLeft(int[] arr, int d) {
		int n = arr.length;
		
		for(int i = 0; i<d; i++) {
			int first = arr[0];
			
			for(int j=0; j<n-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1]= first;
			
		}
		
	}
	
	static void rotateRight(int[] arr,int n, int e) {
		if(e==0) {
			return;
		}
		int last = arr[n-1];
		
		for(int i = n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}			
		arr[0]= last;	
		rotateRight(arr, n, e-1);
	}
		
	public static void main(String[] args) {
		int[] arr1= {6,8,1,6,8,0,5,3};
		int d = 3;
		rotateLeft(arr1, d);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2= {1,2,3,4,5,6};
		int e = 2;
		int n = arr2.length;
		rotateRight(arr2, n, e);
		System.out.println(Arrays.toString(arr2));
	}

}
