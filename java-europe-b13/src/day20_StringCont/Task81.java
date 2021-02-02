package day20_StringCont;

public class Task81 {

	public static void main(String[] args) {
		
		String time="10/10/2019 15:42:00";

		System.out.println(timeStamp(time));
	}

	public static String timeStamp(String time) {
		
		time=time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;
	}
}
