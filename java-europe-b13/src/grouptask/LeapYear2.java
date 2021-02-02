package grouptask;

import java.util.Scanner;

public class LeapYear2 {

	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Pls enter one year");
			int year = scan.nextInt();
			
			System.out.println("The year " +year +" is leap year " + isLeapYear(year) );
		}
		
		System.out.println("I am getting all leap years");
		
		allLeapYears();
	
	
	
	}
	
	public static boolean isLeapYear(int year) {
		
//		if ((year%4 == 0 && year%100!=0) || year%400==0) {
//			return true;
//		}
//		
//		return false;
//		
		
		return (year%4 == 0 && year%100!=0) || year%400==0 ? true : false;
		
	}
	
	public static void allLeapYears() {
		
		for (int i = 1; i <= 2020; i++) {
			if (isLeapYear(i)) {
				System.out.print(i + " ");
			}
		}
	













	}

}
