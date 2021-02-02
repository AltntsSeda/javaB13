package day16_ClassObject;

public class Car {
 
	
	
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo( ) {
		
		String info= "Car make[" + make + "],model["+ model+ "],color ["+ color +"],current speed [" + currentSpeed + "]";
		
		System.out.println(info);
	}
	public void showCurrentSpeed(int speedLimit) {
	}
	public void drive() {
		System.out.println(make + " " + model + "is driving..");
	} 
	
	public void accelerate (int mph) {
		currentSpeed= currentSpeed + mph;
	}
}
