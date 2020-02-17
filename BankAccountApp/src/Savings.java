
public class Savings extends Account {
	//Create properties specific to the Checking account
	String safetyDepBoxID;//3 digit identifier
	String safetyDepBoxCode;//4 digit access code
	//Create class constructor to initialize values
		public Savings(String name, String SSN, double initDeposit, String email) {
			super(name,SSN,initDeposit,email);
			accountNumber = "2" + accountNumber;
			setSDBid();
			setSDBcode();
		}
	
	
	//List any methods that pertain to class
	//savings is .30 points less than the base rate
	public void setBaseRate() {
		m_rate = getBaseRate() - .30;
	}
		
	//3 digits - safety deposit box ID
	private void setSDBid() {
		safetyDepBoxID = super.randomNumbGen(3);
	}
	
	//4 digits - safety deposit box CODE
	private void setSDBcode() {
		safetyDepBoxCode = super.randomNumbGen(4);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT DETAILS: ");
		System.out.println("SAFETY ID: " + safetyDepBoxID + "\nSAFETY CODE: " + safetyDepBoxCode + "\nRATE: " + m_rate + "\n*******************************");
	}
}
