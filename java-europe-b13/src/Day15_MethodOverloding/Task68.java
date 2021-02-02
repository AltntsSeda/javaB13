package Day15_MethodOverloding;

public class Task68 {

	public static void main(String[] args) {
		 
       yearsUntilRetirement("Mike",1990);
	}

	public static int calculateAge(int yearBirth) {
		
		return 2019-yearBirth;
	}
	
	
	
	
	private static void yearsUntilRetirement(String name, int year) {
	
		int retirementAge=65- calculateAge(year);
		
		System.out.println(name + " retires in " + retirementAge + " years.");
	}

}
