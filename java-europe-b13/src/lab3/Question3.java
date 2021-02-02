package lab3;

public class Question3 {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am Java"));
		System.out.println(extraEnd("a"));
		
		
	}
	
	
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String dummy="";
		dummy=str.substring(str.length()-2);
		
		return dummy+dummy+dummy;
	}
}
