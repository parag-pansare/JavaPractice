package basics;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex obj = new Ex();
		obj.exDisp();
	}

}

class Ex{
	void exDisp() 
	{
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		try {
			int a[] = new int[5];
			a[6] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		try {
			String str = "hello";
			int num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		
		try {
			String str2 = null;
			System.out.println(str2.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Exception handled......");
	}
	
}