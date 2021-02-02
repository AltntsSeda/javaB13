package Assignments3;

public class Question5 {

	public static void main(String[] args) {
		int hour, minute, second, totalSecond=3601;
        second=totalSecond%60;
		minute=totalSecond/60;
		hour=minute/60;
		minute=minute%60;
		
		
      System.out.println(hour + " hours "  + minute + " minute " + second + "second" );
	   
	}

}
