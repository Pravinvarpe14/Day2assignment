/*
 * Q3.Write a Program to find Palindrome Number
 */
import java.util.Scanner;
public class For_loop_problem3 {

	public static void main(String[] args) {
		/*
		 * int type variable reverse ,remainder
		 */
	
			System.out.println("enter your number");

			int reverse = 0;
			int remainder = 0;
			int x = 0;
			/*
			 * user input
			 */
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			x=n;
			
			/*
			 *for loop conditional statement 
			 */

			for (; n > 0; n = n / 10) {
				remainder = n % 10;
				reverse = reverse * 10 + remainder;
			}
			
			/*
			 * if else statement for determining Palindrome number
			 */
			if (x == reverse) {
				
				System.out.println("The number is palindrome number");
				
			} else {
				
				System.out.println("The number is not palindrome number");
			}

	}

}
