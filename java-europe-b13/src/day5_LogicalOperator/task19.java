package day5_LogicalOperator;

public class task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a= 50;
		int result=--a + a++ + a-- + a++;
		
		//a in memory: 50-49-50- 49- 50
		
		// result : 49 + 49+50+49=197
		
		System.out.println("a =" + a);
		System.out.println();
		
	}

}
