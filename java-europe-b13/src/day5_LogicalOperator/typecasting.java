package day5_LogicalOperator;

public class typecasting {

	public static void main(String[] args) {
		
		byte b;
		int i=81;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		
		c=(char)i;
		System.out.println("i="+i+" c="+c);//i=81 c=Q
		
		
		i=(int)d;
		System.out.println("d="+d+" i="+i);
		
		
		i=(int)f;
		System.out.println("f="+f+" i="+i);//f=72.38 i=72	
		
		b=(byte)d;
		System.out.println("d="+d+" b="+b);//d=323.142 b=67
	

	}

}
