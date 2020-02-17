import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class BankAccountApp {
	
	public static void main(String[] args) {
		
		String filename = "users.csv";
		File myUsers = new File(filename);
		try {
			Scanner in = new Scanner(myUsers);
			while (in.hasNext()) {
				String data = in.nextLine();
				System.out.println(data);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 	
		}
		
		// TODO Auto-generated method stub
//		Checking chacc1 = new Checking("Brian Matamet","123456789",2000,"brianmatamet@gmail.com");
//		chacc1.showInfo();
//		System.out.println();
//		Savings savacc1 = new Savings("Renzo Matamet","987654321",6000,"renzomat@gmail.com");
//		savacc1.showInfo();
		
		//creating a proper data structure to store the list ***linked list is used for easy insertion/deletion***
		
	}

}
