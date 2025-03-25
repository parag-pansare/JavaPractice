package basics;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c = new child1();
		c.display();
	}
}


class Parent1 {
	void display() {
		System.out.println("This is parent");
	}
}

class child1 extends Parent1{
	
	void display() {
		super.display();
		System.out.println("This is child");
	}
}