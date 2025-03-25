package ArrayProblems;

public class maxProfit {

	static int maximumProfit(int[] arr) {
		int n = arr.length;
		int result=0;
		
		for(int i = 0; i<n-1; i++) {
			
			for(int j = i+1; j<n; j++) {
				
				result = Math.max(result, arr[j] - arr[i]);
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Maximum profit achieved can be : " + maximumProfit(prices));
        
	}

}
