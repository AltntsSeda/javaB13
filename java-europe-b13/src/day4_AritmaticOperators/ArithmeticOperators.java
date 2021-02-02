package day4_AritmaticOperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int chairs= 140;
		System.out.println(chairs+2);
		System.out.println(chairs);
		
		int tables= 130;
		int total= tables+chairs;
		System.out.println(total);
		
		double balance=1200.50;
		double transaction=56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		// Create a variable linesofcode and assign 50 and print "Lines of code 50"
		//
		
		
		int LinesofCode= 50;
		System.out.println("Lines of code" + LinesofCode);
		LinesofCode=LinesofCode-2;
		
		System.out.println("Lines of Code " +  LinesofCode);
		
		System.out.println(22*2);
		
		int classes=5;
		System.out.println(LinesofCode* classes);
		int totalLinesofCode=LinesofCode*classes;
		System.out.println("Total Lines of Codes=" + totalLinesofCode);
		
		System.out.println(10/2);
		System.out.println(60/3);
		
		System.out.println(11*0);
		
		System.out.println(10%2);
		System.out.println(9%2);
		
				

	}

}
