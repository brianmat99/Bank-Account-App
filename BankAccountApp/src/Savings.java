
public class Savings extends Account {
	//Create properties specific to the Checking account
	int safetyDepBoxID;//3 digit identifier
	int safetyDepBoxCode;//4 digit access code
	//Create class constructor to initialize values
		public Savings(String name, String SSN, double initDeposit, String email) {
			super(name,SSN,initDeposit,email);
			System.out.println("SAVINGS ACCOUNT CREATED!");
		}
	//List any methods that pertain to class
}
