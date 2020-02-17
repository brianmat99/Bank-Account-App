import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class BankAccountApp {
	
	public static void main(String[] args) {
		
		String filename = "users.csv";
		File myUsers = new File(filename);
		List<Account> users = new LinkedList<Account>();
		//LinkedList<Account> accountHolders = new LinkedList<Account>;
		try {
			Scanner in = new Scanner(myUsers);
			in.nextLine();//ignoring the first line
			while (in.hasNext()) {
				String data = in.nextLine();//will grab one line, then skip
				String[] values = data.split(",");
				for (int i = 0; i<values.length;i++) {
					//System.out.println(values[i]);
				}
				String name = values[0];
				String SSN = values[1];
				double initDeposit = Double.parseDouble(values[2]);
				String email = values [3];
				String type = values [4];
				//System.out.println(name);
				
				if (type.equals("savings")) {
					users.add(new Savings(name, SSN, initDeposit,email));
				}
				else if (type.equals("checking")) {
					users.add(new Checking(name, SSN, initDeposit,email));
				}else {
					System.out.println("Invalid account.");
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 	
		}
		
		
		
		for (Account account : users) {
			account.showInfo();
		}
	}

}
