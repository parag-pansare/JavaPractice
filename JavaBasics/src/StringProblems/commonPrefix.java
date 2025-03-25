package StringProblems;
//find common prefix between all the string in an array
import java.util.Arrays;

public class commonPrefix {

	public static String longestCommonPrefix(String[] arr) 
	{
		Arrays.sort(arr);
		
		String first = arr[0];
		String last = arr[arr.length-1];
		int minLength = Math.min(first.length(), last.length());
		
		int i=0;
		while(i < minLength && first.charAt(i) == last.charAt(i)) 
		{
			i++;
		}	
		return first.substring(0,i);
	}
	
	
	public static void main(String[] args) 
	{
		 String[] arr = { "geeksforgeeks", "geeks", 
         		"geek", "geezer" };
		 System.out.println(longestCommonPrefix(arr));

	}

}
