package day14_StringReview;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner String = new Scanner(System.in);
		
		System.out.println("Please print a string: ");
		
		String a = String.nextLine();
		
		if (a.length() == 0) {
			System.out.println("string is empty");
		}else if (a.length() > 3) {
			System.out.println(a.substring(a.length()-3));
		}else 
			System.out.println(a);
		
		
		
		
		
	}

}
