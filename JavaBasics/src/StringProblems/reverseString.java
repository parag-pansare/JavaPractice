package StringProblems;
import java.util.Scanner;

public class reverseString {

	static String revString(String s) {
		StringBuffer revS = new StringBuffer();
		
		for(int i=s.length()-1; i>=0;i--) {
			revS.append(s.charAt(i));
		}
		return revS.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter inpt string : ");
		String str = s.nextLine();
		//String str = "absdcf";
		
		String rev = revString(str);
		System.out.println("Reverse string is : " + rev);
	}

}
