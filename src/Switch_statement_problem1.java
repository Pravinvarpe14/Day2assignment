/*
 * Q.1 Write a Program to Check Vowel or Consonant 
 * vowel is a,e,i,o,u and consonent is b,c,d etc
 */
import java.util.Scanner;

public class Switch_statement_problem1 {

	public static void main(String[] args) {  
	
		System.out.println("Enter the Letter");
		
		/*
		 * User input
		 */
		Scanner user =new Scanner(System.in);
		
		char check = user.next().charAt(0);
		/*
		 * switch statement to check condition
		 */
		switch (check) {
		case 'a' :		
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :	
		
			System.out.println("Vowel");
	
			break;
		
		default : 
			System.out.println("consonent");
		
		}

	}

}
