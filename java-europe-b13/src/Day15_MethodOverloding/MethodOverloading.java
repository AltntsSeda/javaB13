package Day15_MethodOverloding;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		
		System.out.println(sum(2,3,6));
		
		int x= sum(10,50,40,5);
		System.out.println(x);

	}
    
	
	
	
	
	
	
	public static int sum(int a,int b) {
    	 return a+b;
     }
     
     public static int sum (int a, int b, int c) {
    	 return a+ b+ c;
     }
     public static int sum(int a, int b, int c, int d) {
    	 return a+b+c+d;
     }
     
}

