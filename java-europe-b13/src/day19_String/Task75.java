package day19_String;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName=sc.next();
		
		System.out.println("Enter your last name");
		String lastName= sc.next();
		
		System.out.println("Total characters in your first and last name is"+ ((firstName.length()+lastName.length())));

	}

}
