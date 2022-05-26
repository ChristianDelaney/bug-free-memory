package day11_review;

import java.util.Scanner;

public class AreYouAuthorized {

	public static void main(String[] args) {
		Scanner employee = new Scanner(System.in);

		System.out.println("Please enter you name:");

		String name = employee.nextLine();

		System.out.println("What is your level of clearance?:");

		int level = employee.nextInt();

		switch (level) {
		case 1:
			System.out.println("Sorry " + name + ", the Junior employees do not have access to this program");
			break;
		case 2:
			System.out.println("Sorry " + name + ", the Senior employees do not have access to this program");
			break;
		case 3:
			System.out.println("Hello " + name + ", you are a level "+level+" employee, welcome to program Tech Circle");
			break;

		case 4:
			System.out.println("Hello " + name + ", you are a level "+level+" employee, welcome to program Tech Circle");

		}

	}

}
