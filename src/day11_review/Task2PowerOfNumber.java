package day11_review;

import java.util.Scanner;

public class Task2PowerOfNumber {

	public static void main(String[] args) {
		Scanner power = new Scanner(System.in);
		
		int a = power.nextInt();
		int b = power.nextInt();
		
		
		for (int i =1;i<b--;i++) {
			a=a*a;
		
		}
			
		System.out.println("the result is: "+a);
		
		
		
		

	}

}
