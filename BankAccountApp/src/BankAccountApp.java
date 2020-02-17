
public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking chacc1 = new Checking("Brian Matamet","123456789",2000,"brianmatamet@gmail.com");
		Savings savacc1 = new Savings("Renzo Matamet","987654321",6000,"renzomat@gmail.com");
		
		chacc1.showInfo();
		System.out.println();
		savacc1.showInfo();
	}

}
