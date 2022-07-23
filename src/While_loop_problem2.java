/*
 *Q1. Write a Program for the sum of n natural numbers
 */
import java.util.Scanner;
public class While_loop_problem2 {

	public static void main(String[] args) {
		
		System.out.println("Enter N number");
		/*
		 * user input
		 */
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();

		int sum = 0;
		int i = 1;
		/*
		 * while loop use for condition satisfying
		 */

		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The addition of Natural numbers = " + sum);

	}

		

	}


