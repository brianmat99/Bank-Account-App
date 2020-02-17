
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
	//checking is 15% of the base rate
	public void setBaseRate() { m_rate = getBaseRate() * .15; }

	private void setDCN() { debitCardNumber = super.randomNumbGen(12); }
	
	private void setDPN() { debitPinNumber = super.randomNumbGen(4); }
	
	public void showInfo() {
		super.showInfo();
		System.out.println("DEBIT CARD NUMBER: " + debitCardNumber + "\nPIN NUMBER: "+ debitPinNumber + "\nRATE: " + m_rate);
	}
}
