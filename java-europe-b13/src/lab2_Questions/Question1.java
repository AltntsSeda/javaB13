package lab2_Questions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter your first number: ");
		    int number = scan.nextInt();
		    int min, max;
		    min= number;
		    max= number;
		    int check= 1;
		    while(check !=0){
		        System.out.println("Enter your next number: ");
		        number = scan.nextInt();//
		        if (min> number){
		            min = number;
		        }
		        else if(number > max){
		            max=number;
		        }
		        System.out.println("Do you want to enter another number : 0-No, 1-Yes ");
		        check= scan.nextInt();
		    }
		    if (min==max){
		        System.out.println("Numbers are equal...");
		    }else{
		        System.out.println("Smallest number is: " + min + "\nLargest number is: " + max);
		    }
		}

	}

