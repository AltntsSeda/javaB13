package Assignment5;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
	
		
			System.out.println("Enter the term to be printed");
			Scanner scan = new Scanner(System.in);
			
			int ch = scan.nextInt();
			System.out.println("The" + ch + " terms of fibanocci numbers are-");
			int a, b, s, n;
			a = b = 1;
			for (n = 1; n <= ch; n++) {
				System.out.print(a);
				s = a + b;
				a = b;
				b = s;
			
			
		
				
			}

		

	
	}

}
