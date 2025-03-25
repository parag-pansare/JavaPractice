package basics;

public class AbstractDemo {

	public static void main(String[] args) {

		System.out.println("Demo for abstract class");
		cd objc = new cd();
		objc.display();
		objc.show();
	}
}

abstract class ab{
	abstract void display();
	void show() {
		System.out.println("This is inside abstract class");
	}
}

class cd extends ab{
	void display() {
		System.out.println("This is inside concrete class and implementation of abstract method ");	
	}
}