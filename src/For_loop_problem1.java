/*
 * Q.1Write a Program for the sum of n natural numbers
 */

import java.util.Scanner;
public class For_loop_problem1 {

	public static void main(String[] args) {
		/*
		 * int type variable n,i,sum
		 */
		int n,i,sum=0;
		
		System.out.println("Enter the number");
		/*
		 * user input by Scanner class
		 */
		Scanner user = new Scanner(System.in);
		
		n = user.nextInt();
		/*
		 * by using for loop for satisfying the condition
		 */
		for(i=1; i<=n; i++) {
			
			sum = sum+i;
		}
		System.out.println("Sum of natural number = " +  sum);
	}

}
