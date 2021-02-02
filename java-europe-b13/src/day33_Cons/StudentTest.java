package day33_Cons;

public class StudentTest {

	public static void main(String[] args) {
		
	
		Student s1 = new Student("Mike", 17, 'M', 2017, "Java");
		Student s2 = new Student("Mary", 25, 'F', 1999, "JS");
		
		System.out.println(s1.university);
		System.out.println(s2.university);
		
		s1.attendLab();
		s2.attendLecture();
				


	}

}
