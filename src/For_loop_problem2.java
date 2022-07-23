/*
 * Q.2 Write a Program to reverse the integer number
 */
import java.util.Scanner;
public class For_loop_problem2 {

	public static void main(String[] args) {
	
		
			System.out.println("enter your number");
			/*
			 * int type variable reverse and remainder
			 */
			int reverse = 0;
			int remainder = 0;
			/*
			 * user input
			 */
			Scanner sc = new Scanner(System.in);
			/*
			 * for loop conditional statement
			 */
 
			for (int n = sc.nextInt(); n > 0; n = n / 10) {
				remainder = n % 10;
				reverse = reverse * 10 + remainder;
			}

			System.out.println("The reverse number is " + reverse);

}
}