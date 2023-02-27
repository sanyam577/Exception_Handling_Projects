import java.util.Scanner;

public class ModifedEH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calculator.com");
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number"); 
		int x = scan.nextInt();
		System.out.println("Enter a number as divisor"); 
		int y = scan.nextInt();
		
		int res = x/y;
		
		System.out.println("here is the result "+ res);
		
		
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the element to be added in that array");
		int ele = scan.nextInt();
		System.out.println("Enter the position");
		int pos = scan.nextInt();
		
		a[pos]= ele;
		
		System.out.println("element "+ele+ "is inserted at position "+pos+ " sucessfully");
		
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NegativeArraySizeException ae) { 
			                                  // we can write multiple exception classes together using | operator
			System.out.println("Ivalid Entry");
		}
		
		//catch(NegativeArraySizeException nase) {
			//System.out.println("size must be a positive number");
		//}
		
		//catch(ArrayIndexOutOfBoundsException ai) {
			//System.out.println("Enter postion in between the size of array");
		//}
		
		catch(Exception e) { // this is general case
			System.out.println("Wrong input");
		}
		
		finally {
			System.out.println("multiple catch and one finally is valid");
		}
		
		System.out.println("Disconnected sucessfully");
	

	}

}








