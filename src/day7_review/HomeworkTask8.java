package day7_review;

import java.util.Scanner;

public class HomeworkTask8 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		int a = number.nextInt();
		int b = number.nextInt();
		
		if (a % b==0) {System.out.println(a+" is an even number");
		
		}else {System.out.println(a+" is an odd number");}

	}

}
