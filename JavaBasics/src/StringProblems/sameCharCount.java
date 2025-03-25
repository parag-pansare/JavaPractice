package StringProblems;



public class sameCharCount {

	public static void charCount (String str) {
		
		int n = str.length();		
		System.out.println(n);
		
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) {
					count++;
				}
			}
			System.out.println("Count of " + str.charAt(i) + " is: " + count);
		}
		
	}
	
	public static void main(String[] args) {
		String str = "india";
		charCount(str);

	}

}
