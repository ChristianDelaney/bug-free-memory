package day5_operator;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner christian = new Scanner(System.in);		
		
		System.out.println("please type value a");
		
		
		//int a =1;
		
		int a = christian.nextInt();
		
		System.out.println("please type value b");
		//int b = 2;
		
		int b = christian.nextInt();
		
		System.out.println("please type value c");
		//int c = 3;
		
		int c = christian.nextInt();
		
		System.out.println(a+b>c);
		
		christian.close();

		
	}

}
