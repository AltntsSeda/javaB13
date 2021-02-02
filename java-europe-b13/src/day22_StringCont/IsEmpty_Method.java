package day22_StringCont;

public class IsEmpty_Method {

	public static void main(String[] args) {
		
		String userName=" ";
		String password="";
		
		if(userName.isEmpty()) {
			System.out.println("User name field can not be empty");
			
		}else {
			System.out.println("Username is not empty");
		}

		if(userName.isEmpty()||password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
	}

}
