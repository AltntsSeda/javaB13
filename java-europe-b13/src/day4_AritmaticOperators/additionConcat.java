package day4_AritmaticOperators;

public class additionConcat {

	public static void main(String[] args) {
		//number+number= Addition
		System.out.println(2+2);
		System.out.println(20+200);
		 
		//Number + string= Concatenation
		System.out.println(5 + "Hello");
		
		//String+Boolean=Concatenation
		System.out.println("hello" + true);
		
		//string+ string= Concatetation
		System.out.println("hello"+"word");
		
		//boolean+number
		//System.out.println(true+1);
		
		System.out.println((2+0+3+"Cybertek")); //5Cybertek
		System.out.println("Cybertek"+2+0+5);//Cybertek205
		System.out.println(2+0+5+"Cybertek"+2+0+5); //7Cybertek205
		System.out.println(2+0+5+"Cybertek"+(2+0+1));
		
		
		
	}
	

}
