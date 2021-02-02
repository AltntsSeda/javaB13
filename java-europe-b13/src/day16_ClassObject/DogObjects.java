package day16_ClassObject;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1= new Dog();
		Dog dog2= new Dog();
		Dog dog3= new Dog();
		
		
		dog1.age=10;
		
		System.out.println(dog1.age);
		
		dog2.age=5;
		System.out.println(dog2.age);
		
		dog1.color="Red";
		dog1.breed="Maltese";
		dog1.name="Rover";
		
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.breed);
        
        dog1.barking();
        dog1.hugry();
        
        
	}

}
