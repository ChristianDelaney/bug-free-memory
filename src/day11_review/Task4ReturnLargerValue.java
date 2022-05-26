package day11_review;

import java.util.Scanner;

public class Task4ReturnLargerValue {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);

		int a = value.nextInt();
		int b = value.nextInt();
		
		if (a > b && a >=10 && a<=20) {
			System.out.println(a);
			
		}if (b > a && b >=10 && b<=20) {
			System.out.println(b);
			}
		else if( a<10 && a>20 || b<10 && b>20) {
			
			System.out.println(0);
		}
	
	}
}
