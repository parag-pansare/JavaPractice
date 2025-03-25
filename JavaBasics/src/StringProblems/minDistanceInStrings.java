package StringProblems;
// this is to find min distance between 2 string in a given array
import java.util.ArrayList;
import java.util.Arrays;

public class minDistanceInStrings {

	public static void main(String[] args) {
		 ArrayList<String> S = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox", "quick"));
		 String word1 = "the", word2 = "fox";
         System.out.println(shortestDistance(S, word1, word2));
	}

	
	public static int shortestDistance(ArrayList<String> s, String w1, String w2) {
		int ans = 0;
		int d1 = -1, d2 = -1;
		
		for(int i = 0; i< s.size(); i++) {
			if(s.get(i).equals(w1)) {
				d1 = i;
			}
			if(s.get(i).equals(w2)) {
				d2 = i;
			}
			if(d1 != -1 && d2 != -1) {
				ans =  Math.abs(d1 - d2);
			}
			
		}	
		return ans;
	}

}
