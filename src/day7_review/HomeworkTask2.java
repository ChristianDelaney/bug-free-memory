package day7_review;

import java.util.Scanner;

public class HomeworkTask2 {

	public static void main(String[] args) {

		Scanner A = new Scanner(System.in);

		int a = A.nextInt();

		if (a <= 2) {
			System.out.println("Infancy");

		} else if (a >= 3 && a <= 4) {
			System.out.println("Toddler");
		}else if (a >= 5 && a <= 7) {
			System.out.println("early school age");

		} else if (a >= 8 && a <= 12) {
			System.out.println("Middle School Age");

		} else if (a >= 13 && a <= 17) {
			System.out.println("Early Adolescence");

		} else if (a >= 18 && a <= 25) {
			System.out.println("Later Adolscence");

		} else if (a >= 25 && a <= 30) {
			System.out.println("early adulthood");

		} else if (a >= 30 && a <= 50) {
			System.out.println("middle adulthood");
		}
		if (a >= 51) {
			System.out.println("later adulthood");
		}

	}

}
