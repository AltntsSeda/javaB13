package day24_ArraysPart1;

public class Task90_FindingCar {

	public static void main(String[] args) {
	
		String[] cars= {"Toyota","Nissan","Bmw","Mercedes","Honda"};
		
		boolean flag=false;
		
		for(int i=0; i<cars.length;i++) {
			
			if(cars[i].equals("Ferrari")) {
				
				flag=true;
				break;
			}
		}

		if(flag) {
			System.out.println("Found it");
		
		
		}else {
			System.out.println("Not found it");
		}
	}

}
