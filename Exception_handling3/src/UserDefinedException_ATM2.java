/*import java.util.Scanner;

class InvaildCustomerException extends Exception {
	
}

class ATM2{
	int userId = 1221;
	int password = 1111;
	int uId;
	int pass;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user Id");
		uId = scan.nextInt();
		System.out.println("Enter user pass");
		pass = scan.nextInt();
		
	}
	
	public void verify() throws InvaildCustomerException  {
		if((userId == uId) && (password == pass)) {
			System.out.println("Take your cash");
		}
		else {
			InvaildCustomerException ice = new InvaildCustomerException();
			System.out.println(ice);
			throw ice;
		
		}
	}
}

class Bank2{
	public void initiate() {
		ATM2 a = new ATM2();
		
		try {
			a.input();
			a.verify();
		} 
		catch (InvaildCustomerException e1) {
			try {
				a.input();
				a.verify();
			} 
			catch (InvaildCustomerException e2) {
				try {
					a.input();
					a.verify();
				} 
				catch (InvaildCustomerException e3) {
					System.out.println("Hello respected user if this card is not yours then return it back otherwise you are decleared as chor ");
				    System.exit(0);
				}
			
			}
		
		}
	}
}
public class UserDefinedException_ATM2 {

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		b.initiate();

	}

} 
*/


// MODIFIED ATM

import java.util.Scanner;

class InvaildCustomerException extends Exception {
	public InvaildCustomerException(String msg) {
		super(msg);
	}
	
}

class ATM2{
	int userId = 1221;
	int password = 1111;
	int uId;
	int pass;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user Id");
		uId = scan.nextInt();
		System.out.println("Enter user pass");
		pass = scan.nextInt();
		
	}
	
	public void verify() throws InvaildCustomerException  {
		if((userId == uId) && (password == pass)) {
			System.out.println("Take your cash");
		}
		else {
			InvaildCustomerException ice = new InvaildCustomerException("Hello respected user if this card is not yours then return it back otherwise you will be decleared as chor by police");
			System.out.println(ice.getMessage());
			throw ice;
		
		}
	}
}

class Bank2{
	public void initiate() {
		ATM2 a = new ATM2();
		
		try {
			a.input();
			a.verify();
		} 
		catch (InvaildCustomerException e1) {
			try {
				a.input();
				a.verify();
			} 
			catch (InvaildCustomerException e2) {
				try {
					a.input();
					a.verify();
				} 
				catch (InvaildCustomerException e3) {
				    System.exit(0);
				}
			
			}
		
		}
	}
}
public class UserDefinedException_ATM2 {

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		b.initiate();

	}

}























