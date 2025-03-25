package ArrayProblems;

public class maxConsecutives {

	static int maxConsecutiveCount(int[] arr) {
		int maxC =0, count=0;
		
		int n = arr.length;
		
		if(arr.length == 0) return 0;
		
		for(int i=1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				count++;
			}
			else {
				maxC = Math.max(maxC, count);
				count = 1;
			}
		}
		
		return Math.max(maxC, count);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,1,1,1,0,1,0,0};

		System.out.println(maxConsecutiveCount(arr));

	}

}
