package bankAccount;

public class exceptionHandling {

	public static void main(String[] args) {
		try {
			Demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("This is in finally block ");
		}

	}
	
	public static void Demo() throws Exception{
		
		System.out.println("Before exception ");
		int a= 1/0;
		System.out.println("After the exception ");
		
		
	}

}
