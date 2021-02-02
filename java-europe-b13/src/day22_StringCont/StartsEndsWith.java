package day22_StringCont;

public class StartsEndsWith {

	public static void main(String[] args) {
		
		String word1="eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		

		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		String name= "Dr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("Married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("Married Woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("Some Woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown Status");
		}
	}

}
