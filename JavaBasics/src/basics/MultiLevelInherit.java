package basics;

public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		level2 obj2 = new level2();
		obj2.display();
		obj2.show();
		obj2.check();
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
	}
}

class Base{
	int a=20;
 	void display() {
 		System.out.println("This is Base");
 }	
}

class Derived extends Base{
	 int b=90;	 
	 void show() {
		 System.out.println("This is Derived");
	 }		
	}

class level2 extends Derived{
	
	int c=190;	 
	void check() {
		 System.out.println("This is level 2 inherited");
	 }	
}