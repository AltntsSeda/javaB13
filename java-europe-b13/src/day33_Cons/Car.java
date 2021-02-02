package day33_Cons;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	// create constructor
	public Car() {
		
		model="Honda";
		make="Civic";
		year=2020;
		mile=5000;
        color="Black";
        
		
	}
	
	public Car (String mo, String ma, int yr, double ml, String cl) {

		model=mo;
		make=ma;
		year=yr;
		mile=ml;
        color=cl;
        
        
	}

	public void Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	
}
