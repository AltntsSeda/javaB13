package day25_ArraysPart2;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]values;
		values=getArray();
		
		
		for (double num : values ) {
			System.out.println(num + "");
		}

	}
	
	public static double[] getArray() {
		double[] array = {1.2,2.3,4.4,5.6};
		
		return array;
	}

}
