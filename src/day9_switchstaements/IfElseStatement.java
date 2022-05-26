package day9_switchstaements;

public class IfElseStatement {

	public static void main(String[] args) {

		char grade = 'D';

		if (grade == 'A') {
			System.out.println("Pass");

		} else if (grade == 'B') {

			System.out.println("Pass");
		}else if (grade == 'C') {

			System.out.println("Pass");
		}else if (grade == 'D') {

			System.out.println("Pass");
		}else if (grade == 'W') {

			System.out.println("Withdrawal");
		}else if (grade == 'I') {

			System.out.println("Incomplete");
		} else { 
		
		System.out.println("Failed");}
		
		
		
		switch(grade) {
		case 'A': 
			System.out.println("Pass");
			break;
		case 'B': 
			System.out.println("Pass");
			break;
		case 'C': 
			System.out.println("Pass");
			break;
		case 'D': 
			System.out.println("Pass");
			break;
		case 'W': 
			System.out.println("Withdrawal");
			break;
		case 'I': 
			System.out.println("Incomplete");
			break;
			default:
		
			System.out.println("Failed");
		
		
		
		
		
		
		
		
		
		
		}
	}

}
