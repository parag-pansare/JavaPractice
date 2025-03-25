package basics;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Add obj1 = new Add();
		obj1.add();
		obj1.add(4);	
	}

}

	class Add{
		void add() {
			
			int a=20, b=30;
			
			System.out.println("Method without arg");	
			System.out.println("Op Overloading concat : a+b is : " + a + b);
			System.out.println("Op Overloading addition  : a+b is : " + (a + b));
		}
		
		void add(int a) {
			System.out.println("Method with arg Int " + a);
		}
		
	
		
	}
