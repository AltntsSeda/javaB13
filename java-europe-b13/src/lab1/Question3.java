package lab1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specialEleven(22);
		specialEleven(33);
		specialEleven(24);
		specialEleven(55);
		
	}
    public static void specialEleven(int number) {
    	
    	if(number%11==0|| (number-1)%11==0 || number%11==1) {
             System.out.println(true);
    } else {
    	System.out.println(false);
  
   }
   
    }
	}

