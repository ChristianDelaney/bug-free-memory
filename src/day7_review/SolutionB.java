package day7_review;

import java.util.Scanner;

public class SolutionB {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		String hello = scanner.nextLine();
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();	
		System.out.println("my string is "+hello);
		System.out.println("the sum of "+numA+" and "+numB+" is "+(numA + numB));
	}

}
