/*
 * Q1.Write a Program to reverse the integer number
 */
import java.util.Scanner;
public class While_loop_problem1 {

	public static void main(String[] args) {
	/*
	 * taking int type variable n & r
	 */
		int n,r;
		System.out.println("Enter the number");
/*
 * Scanner object for user input
 */
Scanner user = new Scanner(System.in);

	n = user.nextInt();
	/*
	 * by using while loop for reverse number condition
	 */
	while (n>0) {
		
		r = n%10;
		n= n/10;
		
		System.out.print (r);
	}
		
		
	
	}

}
