package basics;

public class SingleInheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		System.out.println(c.a);
		c.show();
		c.display();
	}

}

class Parent{
	int a=20;
 	void display() {
 		System.out.println("This is parent");
 }	
}

class Child extends Parent{
	 int a=90;	 
	 void show() {
		 System.out.println("This is child");
		 System.out.println("Accessing parent var with Super : " + super.a);
	 }		
	}