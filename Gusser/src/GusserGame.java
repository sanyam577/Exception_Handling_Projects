import java.util.Scanner;

class Gusser{
	int guessNum;
	
	int guessNum(){
	Scanner	scan=new Scanner(System.in);
	System.out.println("Hello Guesser Enter your name");
	String username = scan.next();
	System.out.println(username);
	
	if(username.equalsIgnoreCase(username)) {
		System.out.println("Valid user for this game");
	}
	else {
		System.out.println("Invalid user");
	}
	
	System.out.println();
	System.out.println("Enter password to login");
	String password = scan.next();
	
	if(password.equals(password)) {
		System.out.println("Valid password");
	}
	else {
		System.out.println("Wrong password");
	}
	
	System.out.println();
	
	System.out.println("Gusser kindly guess a number ");
	guessNum= scan.nextInt();
	return guessNum;
	}
}

class Player{
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	int guessNum1(){
		Scanner	scan=new Scanner(System.in);
		
		System.out.println("Hello Player1 Enter your name");
		String username = scan.next();
		System.out.println(username);
		
		if(username.equalsIgnoreCase(username)) {
			System.out.println("Valid Player for this game");
		}
		else {
			System.out.println("Invalid Player");
		}
		
		System.out.println();
		System.out.println("Enter password to login");
		String password = scan.next();
		
		if(password.equals(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Wrong password");
		}
	System.out.println("Player 1 kindly guess a number ");
	guessNum1=scan.nextInt();
	return guessNum1;
	}
	
	int guessNum2(){
		
		Scanner	scan=new Scanner(System.in);
		
		System.out.println("Hello Player2 Enter your name");
		String username = scan.next();
		System.out.println(username);
		
		if(username.equalsIgnoreCase(username)) {
			System.out.println("Valid Player for this game");
		}
		else {
			System.out.println("Invalid Player");
		}
		
		System.out.println();
		System.out.println("Enter password to login");
		String password = scan.next();
		
		if(password.equals(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Wrong password");
		}
		
		System.out.println("Player2 kindly guess a number ");
		guessNum2=scan.nextInt();
		return guessNum2;
		}
	
	int guessNum3(){
		
		Scanner	scan=new Scanner(System.in);
		
		System.out.println("Hello Player3 Enter your name");
		String username = scan.next();
		System.out.println(username);
		
		if(username.equalsIgnoreCase(username)) {
			System.out.println("Valid Player for this game");
		}
		else {
			System.out.println("Invalid Player");
		}
		
		System.out.println();
		System.out.println("Enter password to login");
		String password = scan.next();
		
		if(password.equals(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Wrong password");
		}
		System.out.println("Player3 kindly guess a number ");
		guessNum3=scan.nextInt();
		return guessNum3;
		}
}

class Umpire{
	int numOfGusser;
	int numOfPlayer1;
	int numOfPlayer2;
	int numOfPlayer3;
	
	
	
	int collectNumFromGusser(){
	Gusser	g =new Gusser();
	numOfGusser =g.guessNum();
	return numOfGusser;
	}
	void collectNumFromPlayer() {
		Player p1= new Player();
		Player p2= new Player();
		Player p3 = new Player();
		
		numOfPlayer1= p1.guessNum1();
		numOfPlayer2= p2.guessNum2();
		numOfPlayer3= p3.guessNum3();	
		
	}
	
	void compare() {
		if(numOfGusser==numOfPlayer1) {
			
			if(numOfGusser==numOfPlayer2 && numOfGusser==numOfPlayer3) {
				System.out.println("All won the game");
			}
			else if(numOfGusser==numOfPlayer2) {
				System.out.println("Player 1 and 2 won the game");
			}
			else if(numOfGusser==numOfPlayer3) {
				System.out.println("Player 1 and 3 won the game");
			}
			else {
				System.out.println("Player 1 won the game");
			}
			
		}
		else if(numOfGusser==numOfPlayer2) {
			if(numOfGusser==numOfPlayer3) {
				System.out.println("Player 2 and 3 won the game");
			}
			else {
				System.out.println("Player 2 won the game");
			}
		}
		else if(numOfGusser==numOfPlayer3) {
			System.out.println("Player 3 won");
		}
		else {
			System.out.println("No one won the game :: Game Over");
		}
		
		
	}
}

public class GusserGame {
public static void main(String[] args) {
      Umpire	u = new Umpire();

      int n = u.collectNumFromGusser();
	  if(n>0 && n<10) {
		u.collectNumFromPlayer();
		u.compare();
	}
		else {
			System.out.println("Error :- Enter number between 0 to 10 ");
		
		}	
   }

}
