package day7_review;

import java.util.Scanner;

public class SolutionC {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.println("Please print first number:");

		int a = number.nextInt();
		
		if (a >= -10 && a <= 10) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("Please print second number:");
		int b = number.nextInt();

		if (b >= -10 && b <= 10) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
