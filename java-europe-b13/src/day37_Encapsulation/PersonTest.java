package day37_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {


		Person p1= new Person();
		//p1.name="Seda";  DOESNT COMPILE
		//p1.age=25;       DOESNT COMPILE
		p1.setName("Seda");
		p1.setAge(25);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
	}

}
