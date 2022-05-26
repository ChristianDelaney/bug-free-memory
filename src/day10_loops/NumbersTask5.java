package day10_loops;

import java.util.Scanner;

public class NumbersTask5 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("print 5 numbers: ");

		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int num3 = num.nextInt();
		int num4 = num.nextInt();
		int num5 = num.nextInt();
		
		if (num1> num2 && num1 >num3 && num1 > num4 && num1 > num5) {
			
			System.out.println(num1+" is the greates number");
		}else if (num2> num1 && num2 >num3 && num2 > num4 && num2 > num5) {
			System.out.println(num2+" is the greatest number");
		}else if (num3> num1 && num3 >num2 && num3 > num4 && num3 > num5) {
			System.out.println(num3+" is the greatest number");
		}else if (num4> num1 && num4 >num2 && num4 > num3 && num4 > num5) {
			System.out.println(num4+" is the greatest number");
		}else if (num5> num1 && num5 >num2 && num5 > num3 && num5 > num4) {
			System.out.println(num5+" is the greatest number");
		}

	}

}
