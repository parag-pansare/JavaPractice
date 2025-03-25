package StringProblems;

public class nonRepeatingChar {

	static char nRc(String s) {
		
		int n = s.length();
		
		for(int i =0; i<n;i++) {
			Boolean found = false;
			
			for(int j=0; j<n; j++) 
			{
				if(i!=j && s.charAt(i) == s.charAt(j)) 
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				return s.charAt(i);
			}
		}
		
		return'$';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tester";
		System.out.println(nRc(s));
		
	}

}
