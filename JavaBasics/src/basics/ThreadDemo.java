package basics;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th t1 = new Th();
		Th t2 = new Th();
		System.out.println("ID is : " + t1.getId());
		System.out.println("Name of thread is : " + t1.getName());
		t1.setName("DemoThread");
		System.out.println("name of thread after change : " + t1.getName());
		System.out.println("Prio of thread is : " + t1.getPriority());
		t1.setPriority(2);
		System.out.println("Prio of thread after change is : " + t1.getPriority());
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) 
		{
		}
		t2.start();
	}
}

class Th extends Thread
{
	
	public void run() 
	{
		for(int i=0; i<6;i++) 
		{
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			System.out.println(i);
		}
	}
}
