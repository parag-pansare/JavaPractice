package basics;

public class StaticDemo {

	static int a=8;
	
	static void display() {
		System.out.println("This is static method");
	}
	
	static
	{	
	System.out.println("This is static Block");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		System.out.println(a);
		StaticDemo.display();
	}

}
