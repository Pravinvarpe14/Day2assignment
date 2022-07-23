/*
 * Q2. Write a Program to print the month name for the given number/
 */

import java.util.Scanner;
public class Switch_statement_problem2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
	/*
	 * user input for number	
	 */
		Scanner user = new Scanner(System.in);
		
		int month = user.nextInt();
	/*
	 * satisfying condition by switch statement	
	 */
		switch (month) {
		
		case 1:
			System.out.println("Janaury");
			break;
		
		case 2:
			System.out.println("February");
			break;
		
		case 3:
			System.out.println("March");
			break;
		
		case 4:
			System.out.println("April");
			break;
		
		case 5:
			System.out.println("May");
			break;
		
		case 6:
			System.out.println("June");
			break;
		
		case 7:
			System.out.println("July");
			break;
		
		case 8:
			System.out.println("August");
			break;
		
		case 9:
			System.out.println("September");
			break;
		
		case 10:
			System.out.println("October");
			break;
		
		case 11:
			System.out.println("Novmber");
			break;
			
		case 12:
			System.out.println("December");
			break;
		
		default: 
			System.out.println("Enter invalid number");
	}

	}

}
