package Day15_MethodOverloding;

public class Task66 {

	public static void main(String[] args) {

      double distanceTraveled=distance(40,5);
  
      System.out.println(distanceTraveled);
	
  if(distanceTraveled>500) {
       System.out.println("you spent too much gas");
	}else {
		System.out.println("you spend ok gas");
		
	}
	}

	
	public static double distance (double speed,int time) {
		
		double distanceTraveled=speed*time;
		
		return distanceTraveled;
	}
}
