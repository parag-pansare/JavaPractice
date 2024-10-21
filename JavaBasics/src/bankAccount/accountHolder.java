package bankAccount;

public class accountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountDetails tom = new accountDetails();
		accountDetails jerry = new accountDetails();
		
		tom.fName = "Tom";
		tom.lName = "Holland";
		tom.age = 20;
		tom.accountBalance = 10000;
		System.out.println("Is tom eligible for CC : " + tom.eligibilityCheck());
		
		jerry.fName = "Jerry";
		jerry.lName = "Maguire";
		jerry.age = 27;
		jerry.accountBalance = 25000;
		System.out.println("Is jerry eligible for CC : " + jerry.eligibilityCheck());
	}

}
