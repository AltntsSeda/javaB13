package day8_ifElse;

import java.util.Scanner;

public class threenumbersifelse {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println(" Birinci sayiyi giriniz.");
		int no1=scan.nextInt();
		System.out.println(" Ikinci sayiyi giriniz.");
		int no2=scan.nextInt();
		System.out.println(" Ucuncu sayiyi giriniz.");
		int no3=scan.nextInt();
		System.out.println("Yapilan islemle sonucunda en buyuk sayi asagida belirtilmistir");
		
		if (no1>no2&&no1>no3) {
			
			System.out.println(no1 +" is greatest.");
			
		} else if (no2>no1&&no2>no3) {
			
			System.out.println(no2 +" greatest.");
		}
		
		else if (no3>no1&&no3>no2) {
			
			System.out.println(no3 +" greatest.");
			
		}
             
		
	}

}
