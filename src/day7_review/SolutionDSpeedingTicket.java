package day7_review;

import java.util.Scanner;

public class SolutionDSpeedingTicket {

	public static void main(String[] args) {
		
		Scanner ticket = new Scanner(System.in);
		
		System.out.println("What is the driver's first name?:");
		
		String a = ticket.nextLine();
		
		System.out.println("What is driver's last name?:");
		
		String b = ticket.nextLine();
		
		System.out.println("what is driver's age?:");
		
		int c = ticket.nextInt();
		
		System.out.println("What is the speed limit?:");
		
		int d = ticket.nextInt();
		
		System.out.println("How fast was driver going?:");
		
		int e = ticket.nextInt();
		
		System.out.println("Is this a construction zone (Y/N)?:");
		
		String f = ticket.next();
		
		
		System.out.println("Driver's Name: "+a+" "+b);
		System.out.println("Age: "+c+" years old");
		System.out.println("Speed limit: "+d+" mph");
		System.out.println("Construction Zone?: "+f);
		
		if (e >= 26 && e <= 29) {
			System.out.println("Speeding fine: $0");
		}else if (e == 30) {
			System.out.println("Speeding fine: $30");
		}else if (e == 35) {
			System.out.println("Speeding fine: $60");
		}else if (e == 40) {
			System.out.println("Speeding fine: $90");
		}else if (e == 45) {
			System.out.println("Speeding fine: $120");
		}else if (e == 50) {
			System.out.println("Speeding fine: $250");
		}else if (e == 55) {
			System.out.println("Speeding fine: $300");
		}else if (e == 60) {
			System.out.println("Speeding fine: $350");
		}else if (e == 65) {
			System.out.println("Speeding fine: $400");
		}else if (e == 70) {
			System.out.println("Speeding fine: $450");
		}else if (e == 75) {
			System.out.println("Speeding fine: $500");
		}else if (e == 80) {
			System.out.println("Speeding fine: $550");
		}else if (e == 85) {
			System.out.println("Speeding fine: $600");
		}else if (e == 90) {
			System.out.println("Speeding fine: $650");}
		
		
		
		if (c<21 && e >= 45) {System.out.println("Additional Underage Speeding fine: $300");}
		
	
		
		
		

	}

}
