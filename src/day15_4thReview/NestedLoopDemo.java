package day15_4thReview;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		
		for (int row = 0;row < 10;row++) { // row
			for(int column = 0;column <10;column++) { // column
				System.out.print(column+" ");
				}
			
			System.out.println();
			
		}

		
		System.out.println("---------------");
		
		
		for (int row = 0;row < 10;row++) {
			System.out.println(row);
			if (row == 5)break;
			
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		while (true) {
			String in = sc.next();
			if (in.equals ("exit")) break;
			System.out.println(in);
			System.out.println("========");
			
			
		}
		
		System.out.println("---------------");
		while (true) {
			int input = sc.nextInt();
			if (input >0 && input <= 100) break;
			System.out.println("choose number between 1-100:");
			System.out.println("========");}
		
	}

}
