package day5_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// &&, ||, !
		//&& AND
		/*CONDITIONA  CONDITIONB  RESULT
		 *  TRUE         TRUE     true  
		 *  TRUE         FALSE     FALSE 
		 * 
		 * */
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a + b == c;
		
		boolean conditionB = c - b == a;
		
		System.out.println(conditionA && conditionB);
		
		System.out.println((a + b == c) && (c - b == a));
		
		conditionA = c/ b >= 3;
		conditionB = a+b> c;
		
		boolean result = conditionA && conditionB;
		
		System.out.println(result);
		
		String userName = "techcircle";
		String password = "abc123";
		
		System.out.println(userName == "techcircle" && password == "abc123");
		System.out.println(userName == "abc123" && password == "techcircle");
		
		
		
		// || or operator
		
		a = 1;
		b = 2;
		c = 3;
		
	    conditionA = a + b == c; // true
	    conditionB = a-b > c; // false
	    
	    System.out.println(conditionA || conditionB);
	    
	    System.out.println(true || false); // true
	    
	    System.out.println(false || false);
	    
	    System.out.println(conditionA || c/a==3);
	    
	    System.out.println(c+a>b+a || a < 5);
	    
	    
	    // Logical not !
	    
	    conditionA = true;
	    conditionB = false;
	    
	    System.out.println(!conditionA);
	    System.out.println(!conditionB);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		

	}

}
