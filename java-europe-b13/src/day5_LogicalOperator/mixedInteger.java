package day5_LogicalOperator;

public class mixedInteger {

	public static void main(String[] args) {
	
			int i1=5;
			int i2=10;
			float f1=15.5f;
			double d1=20.5;
			//byte - > short - > int - > long - > float - > double
			
			int res1=i1+i2;
			float res2=i1+f1;//Float bigger than int
			double res3 =i2+d1;//bigger one double
			
			short firstNumber=10;
			short secondNumber=20;
			
			int thirdNumber=firstNumber+secondNumber; // eger byte ve shortta islem yapman gerekirse bunu int yapmalisin!
			
			short thirdNumber2=(short)(firstNumber+secondNumber); // illa short yapacaksan casting yapmalisin!
			//byte b1=20;
			//byte b2=2;
			//byte b3=(byte)(b1*b2);
			
			//important//
			
			int b1=126;
			int b2=1;
			
			//byte res=(b1+b2);// Casting is required
			byte res=(byte)(b1+b2);
			byte res4= 126 + 1; //No casting is required
	}

}
