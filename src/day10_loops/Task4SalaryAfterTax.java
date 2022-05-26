package day10_loops;

import java.util.Scanner;

public class Task4SalaryAfterTax {

	public static void main(String[] args) {
		
		Scanner salary = new Scanner(System.in);
		System.out.println("Salary after taxes: ");
		boolean isMarried = true;
		int a = salary.nextInt();
		
		if (a >= 130000) {
			float b = a *.35f;
			System.out.println(a - b+" is your salary after tax");
			
			}else if (a >= 100000 && a <= 129999) {
				float c = a * .30f;
				System.out.println(a - c+" is your salary after tax");
				
			} else if (a >= 80000 && a <= 100000) {
				float d = a * .25f;
				System.out.println(a - d+" is your salary after tax");
				
			}else if (a <= 80000) {
				float e = a * .20f;
				System.out.println(a - e+" is your salary after tax");
				
			} 
		
		
		        if (a >=80000 && isMarried == true) {
				float f = a * .5f;
				System.out.println(a-f+" is your additional 5% off");
				
			}
				
		
			}

	}


