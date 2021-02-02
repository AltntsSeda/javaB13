package day25_ArraysPart2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		

		final int EMPLOYEES=5;
		double payRate;
		double grossPay;
		
		//create scanner object for input
		Scanner sc=new Scanner(System.in);
		
		//create any array to hold employee hours
		int[] hours=new int[EMPLOYEES];
		
		//Get the hours worked by each employee
		System.out.println("Enter the hours worked by" + EMPLOYEES + " employes who all earn the same hourly wage");
		
		for( int i=0; i<EMPLOYEES;i++) {
			hours[i]=sc.nextInt();
		}
		
		// get the hourly pay rate 
		System.out.println("Enter the hourly rate for each employee");
		payRate=sc.nextDouble();
		
		//display each employee's gross pay
		for( int i=0; i<EMPLOYEES;i++) {
			grossPay=hours[i]*payRate;
			
			System.out.println("Employee #" + (i+1)+ ": $"+ grossPay);
		}
	}

}
