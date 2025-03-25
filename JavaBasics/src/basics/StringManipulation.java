package basics;

public class StringManipulation {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = " World";
		
		System.out.println("Length of string = "+ str1.length());
		System.out.println("Char at index 3 = "+ str2.charAt(3));
		System.out.println("String after conacat = "+ str1.concat(str2));
		System.out.println("String after trim = "+ str2.trim());
		System.out.println("Index of r = "+ str2.indexOf('r'));
		System.out.println("string in uppercase = "+ str1.toUpperCase());
		System.out.println("string in lowercase = "+ str2.toLowerCase());
		System.out.println("Compare result "+ str1.compareTo("Hello"));
		
		System.out.println();
		System.out.println("--------------String Buffer-----------------");
		
		StringBuffer str = new StringBuffer("Welcome ");
		System.out.println("Original string is : "+ str);
		System.out.println("Length of string : "+ str.length());
		System.out.println("String after append : "+ str.append("Java"));
		System.out.println("String after insertion : " + str.insert(10, "Test"));
		System.out.println("String after deletion : " + str.delete(10, 14));
		System.out.println("String after replace : " + str.replace(8,12, "Python"));
		System.out.println("Substring is : " + str.substring(8));
		System.out.println("Sub-seq is : "+ str.subSequence(3, 10));
		
		System.out.println("String after reverse : " + str.reverse());
		
	}

}
