package randomPracticePrograms;

import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st no : ");
		int a = s.nextInt();
		System.out.println("Enter 2nd no : ");
		int b = s.nextInt();

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Num after swap are : a = "+ a + " b = " + b);
		
	}

}
