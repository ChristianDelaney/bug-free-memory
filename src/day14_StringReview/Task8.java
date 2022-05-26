package day14_StringReview;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Print word: ");
		
		String word = scan.nextLine();
		if (word.length() < 3) {
			System.out.println("too short");
		}else if(word.length() > 3) {
			System.out.println("too long");
		
		}else if (word.charAt(1) == 'a' && word.length()==3) {
			System.out.println("Cool Word");
			
		}else if(word.charAt(1) != 'a'&& word.length() ==3 ) {
			System.out.println("Okay Word"); 
		
		}
			
			

	}

}
