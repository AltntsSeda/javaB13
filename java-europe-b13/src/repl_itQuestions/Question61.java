package repl_itQuestions;

import java.util.Scanner;

public class Question61 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			
			int bigger=(num1>num2)? num1 :num2;
			System.out.println(bigger);
			
			System.out.println( (num1 > num2) ? num1 : num2 );
	}
}
