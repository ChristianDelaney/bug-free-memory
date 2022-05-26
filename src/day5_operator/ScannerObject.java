package day5_operator;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		
		//Create instance of scanner object
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("how old are you Christian?");
		
		int a = s.nextInt();
		
		System.out.println("wow that's old, when is your birthday?");
		
		int birthday = s.nextInt();
		
		System.out.println("well happy early birthday!");
		
		
		
		s.close(); 
		
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("where are we going?");
		
		String z = c.nextLine();
		
		System.out.println("how will we get there?");
		
		String f = c.nextLine();
		
		System.out.println("well i hate planes! and that is way too far! im not going");
		
		String h = c.nextLine();
		
		System.out.println("well you have fun by yourself! wait im kidding1");
		
		c.close();
		
		
		Scanner w = new Scanner(System.in);
		
		System.out.println("Jennie is beautiful");
		
		boolean babyIsBeautiful = w.nextBoolean();
		
		System.out.println("I am married to her");
		
		boolean isHot = w.nextBoolean();
		
		System.out.println("We will have another child soon");
		
		boolean yeah = w.nextBoolean();
		
		w.close();
		
		
		Scanner q = new Scanner(System.in);
		
		System.out.println("how many pieces of pizza do you want");
		
		short g = q.nextShort();
		
		System.out.println("we only have 1 pizza, so how many do you want now?");
		
		short o = q.nextShort();
		
		System.out.println("ok thanks for being considerate");
		
		q.close();
		
		
	
		
		
		
		

	}

 
}
