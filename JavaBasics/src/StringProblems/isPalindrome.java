package StringProblems;
import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string for checking palindrome: ");
		String input = s.nextLine();
		System.out.println(checkPalindrome(input));
		
	}

	
	public static String checkPalindrome(String input) {
		int left = 0;
		int right = input.length() -1;
		
		
		while(left<right) {
			
			if(input.charAt(left) != input.charAt(right)) 			
				return "Not palindrom";
			
			left++;
			right--;
		}
		return "Is palindrome";
	}
	
}
