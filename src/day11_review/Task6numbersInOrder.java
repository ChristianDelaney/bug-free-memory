package day11_review;

import java.util.Scanner;

public class Task6numbersInOrder {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.print("Please enter numbers:");
		int a = number.nextInt();
		int b = number.nextInt();
		int c = number.nextInt();

		if (a < b && b < c ) {
			System.out.println(true);
		}else if (a == b && c > a && c> b) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		
		}

	}

}
