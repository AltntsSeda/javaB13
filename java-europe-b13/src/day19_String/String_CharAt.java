package day19_String;

public class String_CharAt {

	public static void main(String[] args) {
		
		String word="Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		// System.out.println(word.charAt(8));
		
		
		// Check it first character is "A"
		String word2="Apple";
		
		if (word2.charAt(0)=='A') {
		System.out.println("A is a first character");
		
		}else {
			System.out.println("A is not first character");
		}
	
	String word3="civic";
	
	char first=word3.charAt(0);
	char last=word3.charAt(4);
	
	if (first==last) {
		System.out.println("First and last match");
	}else {
		System.out.println("First and last no match");
	}
	
	String word4= "Java Script";
	
	char lastChar= word4.charAt(word4.length()-1);
	
	System.out.println("Last char of "+ word4 + " is " + lastChar );
	
	}
}
