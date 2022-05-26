package day7_review;

public class LogicalOperator {

	public static void main(String[] args) {
		//binary operators
		
		// AND operator && 
		
		boolean isGood = true;
		boolean isGreat = true;
		
		boolean myGod = isGood && isGreat;
		
		System.out.println(myGod);
		
		// OR operator ||
		
		System.out.println(true || false || true );
		
	//precedence of logical operator
		/*
		 *1. ()
		 *2. !
		 *3. &&, ||
		 *
		 * */
		
		boolean b = true && false;
		boolean w = ((true || false) && !false);
		 System.out.println(b);
		 System.out.println(w);
	
		
		// unary operators
	}

}
