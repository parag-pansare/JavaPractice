package StringProblems;

public class equalRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abba";
		String s2 = "bbaa";
		
		System.out.println( rotateString(s1, s2));
				
	}
	
	static boolean rotateString(String S1, String S2) {
		int n = S1.length();
		
		for(int i = 0; i<n; i++) {
			if (S1.equals(S2)) {
				return true;
			}
			char last = S1.charAt(n-1);
			S1 = last + S1.substring(0, n-1);
			System.out.println("String S1 after " + i + " rotation is " + S1);
			System.out.println("String S2 is " + S2);
		}
		
		return false;
	}
	
}