package day20_StringCont;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your username");
		String userName=sc.nextLine();
		
		System.out.println("Enter your password");
		String password=sc.nextLine();
		
		String userNameInSystem="Mike";
		String passwordInSystem="123";
		
		if (userName.equals("")&& password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if (userName.equals("")&&!password.equals("")) {
			System.out.println("Username can not be Empty");
		}else if (!userName.equals("")&&password.equals("")) {
            System.out.println("Password can not be empty");
            
		}else if (!userName.equals(userNameInSystem)|| !password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid, please verify");
		}else if (userName.equals(userNameInSystem)&& password.equals(passwordInSystem)) {
			System.out.println("User logged in Succesfully");
		}
	}

}
