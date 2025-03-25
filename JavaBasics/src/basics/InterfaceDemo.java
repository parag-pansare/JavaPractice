package basics;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interAB obj1 = new interAB();
		obj1.dispA();
		obj1.dispB();
	}

}

interface intA{
	void dispA();
}

interface intB{
	void dispB();
}

class interAB implements intA, intB
{

	@Override
	public void dispA() {
		System.out.println("Methods in interface A ");	
	}

	@Override
	public void dispB() {
		System.out.println("Methods in interface B ");
	}		
}