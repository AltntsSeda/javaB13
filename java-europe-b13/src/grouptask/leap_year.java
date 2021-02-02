package grouptask;

import java.util.Scanner;

public class leap_year {

	public static void main (String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			int year;

System.out.println("Please Enter the year ");
year=scan.nextInt();

isleap(year);
		}
	
	}
	
	
	public static void isleap(int year) {
	
	if (year % 4 == 0 && year % 100 != 0) {
        System.out.println(year +" is a leap year");
	}else if (year %400== 0) {
		
        System.out.println(year + " is a leap year");
        
	}else {
		System.out.println(year + " is Not a leap year");
		
	}
	
	}}

	