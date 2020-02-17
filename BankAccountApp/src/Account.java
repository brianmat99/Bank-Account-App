
public abstract class Account implements IBaseRate {
//List Properties that include both Savings and Checking account
	//Member variables listed with "m_"
	String m_name;
	String m_SSN;
	String m_email;
	String accountNumber;
	static int index = 100000;
	
	double m_balance;
	double m_rate;
	/* Create constructor to initialize values
	*  Information that will be used in both checking and savings
	*/
	public Account(String name, String SSN, double initDeposit, String email) {
		m_name = name;
		m_SSN = SSN;
		m_balance = initDeposit;
		m_email = email;
		
		setAccountNumber();
		//System.out.println("NAME: " + m_name + "\nSSN = " + m_SSN + "\nBALANCE = $" + m_balance + "\nEMAIL = " + m_email);
	}
	// List methods that pertain to the Account
	protected String randomNumbGen(long size) {
		long randomNumb;
		do {
			randomNumb = (long)(Math.random() * Math.pow(10, size));
			if (String.valueOf(randomNumb).length() == size) {
				break;
			}
		}while (1!=0);
		String numb = String.valueOf(randomNumb);
		return numb;
	}
	
	/* For account number
	 * 11 digits
	 * (first digit) 1 for checking, 2 for savings ***This will be done in derived classes***
	 * (6 digits) unique 6 digit combination
	 * (2 digits) last 2 digits of SSN
	 * (2 digits) random 2 digit number
	 */
	private void setAccountNumber() {
		String lastTwoOfSSN = m_SSN.substring(m_SSN.length()-2, m_SSN.length()); 
		String randomTwoDig = randomNumbGen(2);
		accountNumber = index + lastTwoOfSSN + randomTwoDig;
		index++;
	}
}
