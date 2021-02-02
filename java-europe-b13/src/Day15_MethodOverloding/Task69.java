package Day15_MethodOverloding;

public class Task69 {

	public static void main(String[] args) {
	
		
		int number= 37;
		
		if (isPrime(number)) {
			System.out.println(number + " is a prime number");
		
		} else {
			
			System.out.println(number + " is not prime number");
		}

	}
	
	public static boolean isPrime(int number) {
		
		boolean flag=true;
		
		if(number==0 || number==1) {
			
			flag=false;
		} else {
			
			for (int i=2;i<number;i++) {
				flag= false;
				if (number%i==0) {
					
					break;
				}
			
			}
		}
	
	return flag;
	}
	

}
