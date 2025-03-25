package basics;

public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b objb = new b();
		c objc = new c();
		
		objb.display();
		System.out.println("Accessing through object of class b : " + objb.a);
		objb.show();
		System.out.println("Accessing through object of class b : " + objb.b);
		
		objc.display();
		System.out.println("Accessing through object of class c : " + objc.a);
		objc.check();
		System.out.println("Accessing through object of class c : " + objc.c);

	}

}

class a1{
	int a=20;
 	void display() {
 		System.out.println("This is parent");
 }	
}

class b extends a1{
	 int b=90;	 
	 void show() {
		 System.out.println("This is 2nd class");
	 }		
	}

class c extends a1{
	 int c=110;	 
	 void check() {
		 System.out.println("This is 3rd class");
	 }		
	}