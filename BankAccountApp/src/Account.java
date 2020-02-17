
public abstract class Account implements IBaseRate {
//List Properties that include both Savings and Checking account
	//Member variable listed with "m_"
	String m_name;
	String m_SSN;
	String m_email;
	
	
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
		System.out.println("NAME: " + m_name + "\nSSN = " + m_SSN + "\nBALANCE = $" + m_balance + "\nEMAIL = " + m_email);
	}
	// List methods that pertain to the Account
}
