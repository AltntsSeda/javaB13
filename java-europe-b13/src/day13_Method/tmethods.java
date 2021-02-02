package day13_Method;

public class tmethods {

	public static void main(String[] args) {
	
	calculator(9,3,"/");
	calculator(10,6,"-");
	
	
}

	private static void calculator(int i, int j, String g) {
		
	/*	
		switch(g) {
		 case "+" : 
		    System.out.println(i+j);	
		    break;
		 case "-" : 
			 System.out.println(i-j);
			 break;
		 case "*" : 
			    System.out.println(i*j);	 
			    break;
	    case "/" : 
				 System.out.println(i/j);
				 break;
				 default:
					 System.out.println("WRONG!!!!");
				 
		 
		} */
		
	if (g=="+") {
		System.out.println(i+j);
		
	}else if (g=="-") {
		System.out.println(i-j);
	
		
	}
		
	}
}