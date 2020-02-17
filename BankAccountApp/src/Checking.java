
public class Checking extends Account{
//Create properties specific to the Checking account
	String debitCardNumber;//12 digit debit card number
	String debitPinNumber;//4 digit pin number
//Create class constructor to initialize values
	public Checking(String name, String SSN, double initDeposit, String email) {
		super(name, SSN, initDeposit, email);
		accountNumber = "1" + accountNumber;
		setDCN();
		setDPN();
		//System.out.println("ACC#: " + accountNumber + "\nCARD: "+ debitCardNumber + "\nPIN: " + debitPinNumber);
	}

//List any methods that pertain to class
	private void setDCN() {
		debitCardNumber = super.randomNumbGen(12);
		
	}
	
	private void setDPN() {
		debitPinNumber = super.randomNumbGen(4);
	}
}
