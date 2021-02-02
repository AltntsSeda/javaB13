package day4_AritmaticOperators;

public class wages {

	public static void main(String[] args) {
		
		double regularWage;//The calculated regular wage
		double basePay=25; // The base pay
		double regularHours=40; //
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=10;
		double totalWage;
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $" + totalWage);

	}

}
