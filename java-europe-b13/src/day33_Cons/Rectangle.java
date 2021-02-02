package day33_Cons;

public class Rectangle {
	
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length * width);
		
	}
		
	
	    // constructor
		public Rectangle() {
			
		}
		public Rectangle(int a, int b) {
			
			length=a;
			width=b;
		}
	}


