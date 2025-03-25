package basics;

public class ConstructorDemo {
	String name;
	int rollNo;
	
	ConstructorDemo(){
		name= "Vini";
		rollNo= 7;
	}
	
	ConstructorDemo(String str, int n){
		name=str;
		rollNo=n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo c1 = new ConstructorDemo();
		System.out.println(c1.name);
		System.out.println(c1.rollNo);
		
		ConstructorDemo c2 = new ConstructorDemo("Mbappe", 11);
		System.out.println("This is parameterized cnstr");
		System.out.println(c2.name);
		System.out.println(c2.rollNo);
		
		StaticDemo.display();
	}

}
