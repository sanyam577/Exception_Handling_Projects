import java.util.Scanner;

class ATM{
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
	
	public void verify() {
		if((userId == uId) && (password == pass)) {
			System.out.println("Take your cash");
		}
		else {
			System.out.println("This card belongs to you ? ");
		
		}
	}
}

class Bank{
	public void initiate() {
		ATM a = new ATM();
		a.input();
		a.verify();
	}
}
public class ATM1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();

	}

}
