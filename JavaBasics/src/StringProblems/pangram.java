package StringProblems;
//pangram contains all alphabets from A to Z
public class pangram {

	public static boolean checkPangram(String s) 
	{
		
		for(char ch='a'; ch<='z'; ch++) 
		{
			boolean found = false;
			
			for(int i=0; i<s.length(); i++) 
			{
				if(ch== Character.toLowerCase(s.charAt(i)))
				{
					found=true;
					break;
				}
			}
			if(found==false) {
			return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "The quick brown fox jumps over the lazy dog";
	        if (checkPangram(s) == true)
	            System.out.println("true");  
	        else
	            System.out.println("false"); 
		
	}

}
