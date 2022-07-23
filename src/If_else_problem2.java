/*
 * Q2. Read a Number 1,10,100,1000 and display unit, ten hundred
 */
import java.util.Scanner;
public class If_else_problem2 {

	public static void main(String[] args) {
	/*
	 * user input
	 */
		Scanner number = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int x = number.nextInt();
		/*
		 * satisfying condition by if else statement
		 */
		if (x == 1) {
			System.out.println("Unit");
			
		} else if (x == 10) {
			System.out.println("Ten");
			
		} else if (x == 100) {
			System.out.println("Hundred");
			
		} else if (x == 1000) {
			System.out.println("Thousand");
			
		} else {
			System.out.println("Please enter a valid number");
		}

	}

}
