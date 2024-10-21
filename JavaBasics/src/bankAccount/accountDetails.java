package bankAccount;

public class accountDetails {

	String fName;
	String lName;
	int age;
	float accountBalance;
	
	public boolean eligibilityCheck() {
		
		if(age>25 && accountBalance>=20000) {
			return true;
		}
		return false;
	}
	
}
