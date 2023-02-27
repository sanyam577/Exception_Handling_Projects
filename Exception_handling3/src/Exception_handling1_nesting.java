import java.util.Scanner;

public class Exception_handling1_nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside outer try");
			
			try {
				System.out.println("inside inner try");
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("inside inner catch");
			}
			finally {
				System.out.println("inside inner finally");
			}
		}
		catch(Exception ee) {
			System.out.println("inside outer catch");
		}
		finally {
			System.out.println("inside outer finally");
		}
		
	}

}


/*
 * 
 * 
public class Exception_handling1_nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside outer try");
			
			try {
				System.out.println("inside inner try");
				System.out.println(10/0);
			}
			catch(ArrayIndexOutOfBoundsException e) { //control will not enter inside this catch block
				System.out.println("inside inner catch");
			}
			finally {
				System.out.println("inside inner finally");
			}
		}
		catch(Exception ee) {
			System.out.println("inside outer catch");
		}
		finally {
			System.out.println("inside outer finally");
		}
		
	}

}
*/
