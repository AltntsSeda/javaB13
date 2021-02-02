package Assignments3;

public class Question7 {

	public static void main(String[] args) {
		
		int change, quarters,dimes,nickles,price=95;
		change=100-price;
		quarters=change/25;
		change=change%25;
				
	    dimes=change/10;
	    change=change%10;
	    
	    nickles=change/5;
	    
	    System.out.println("Price in cents: " + price);
		System.out.println("Your change is "+ quarters +" quarters " + dimes +" dimes "+ nickles + " nickles");

	}

}
