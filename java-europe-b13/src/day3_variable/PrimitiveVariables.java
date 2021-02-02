package day3_variable;

public class PrimitiveVariables {

	public static void main(String[] args) {
		  
		byte b1=25;
	    byte b2=-25;
	    // byte b3=128
	    
	    System.out.println("b2= " +b1);
        System.out.println("b2=" + b2);
        
        short s1=-32768;
        short s2= 32767;
        short s3= 500;
        
        System.out.println("s1= " + s1);
        System.out.println("s2 =" + s2);
        System.out.println("s3= " + s3);
        
        int i1= -214768;
        int i2= 20;
        int i3= 100_000;
        System.out.println("i1 = "+ i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3= "+ i3);
        
        long l1= 5000l; // Suffix is optional.Literal 5000 is of int type
        long l2= 2147483649L; //Suffix is mandatory, this number is out of int range
        
        long creditCardNumber = 57575_1234_3453_9832L;
        
        System.out.println("l1 = " + l1);
        System.out.println("l2 =" + l2);
        System.out.println("creditcardNumber= " + creditCardNumber);
        
        float f1= 2.1f;
        
        double d1 = 3.14;
        
        System.out.println("f1= "+ f1);
        System.out.println("d1= "+ d1);
        
        char c1 = 'A';
        char c2= 65;
        		
	}

}
