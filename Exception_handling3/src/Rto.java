import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException(String mesg) {
		super(mesg);
	}
}
class OverAgeException extends Exception{
	public OverAgeException(String mesg) {
		super(mesg);
	}
}

class Applicant{
	String name;
	int age;
	String address;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name"); 
		name = scan.nextLine();
		System.out.println("enter your address"); 
		address = scan.nextLine();
		System.out.println("enter your age");
		age = scan.nextInt();
		
		
	}
	
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18) {
			UnderAgeException uae = new UnderAgeException("Oh you have to wait");
			System.out.println(uae.getMessage());
			throw uae;
		}
		
		if(age>60) {
			OverAgeException oae = new OverAgeException("Respected elderly person you are eligible for it");
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
	
}

class Check {
	public void initiate() {
	Applicant a = new Applicant();
	try {
	a.input();
	a.verify();
	}
	catch(UnderAgeException| OverAgeException e1){
		try {
			a.input();
			a.verify();
			}
			catch(UnderAgeException| OverAgeException e2){
				
			}
	}
}
}

public class Rto {

	public static void main(String[] args) {
		Check r = new Check();
		r.initiate();

	}

}
