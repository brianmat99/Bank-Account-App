
public class Checking extends Account{
//Create properties specific to the Checking account
	String debitCardNumber;//12 digit debit card number
	String debitPinNumber;//4 digit pin number
//Create class constructor to initialize values
	public Checking(String name, String SSN, double initDeposit, String email) {
		super(name, SSN, initDeposit, email);
		System.out.println("CHECKING ACCOUNT CREATED!");
		setDCN();	
	}
	
	private void setDCN() {
		String DCN = super.randomNumbGen(12);
		System.out.println(DCN);
	}
	

//List any methods that pertain to class
}
