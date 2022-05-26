package day3_1streview;

import java.awt.Point;

public class PrimitiveVSReference {

	public static void main(String[] args) {
		
		//primitive
		
		int x = 1; // initialize x to 1
		int y = x; // assign x to y
		x = 2; // reassign x to 2
		System.out.println("x="+x+",y="+y);
		
		//reference
	
		Point pointA =  new Point(1,1); // 1,1
		Point pointB = pointA; // pointB = 1,1
		pointA.y = 2; // pointA = 1,2 | pointB 1,2
		System.out.println("PointA="+pointA+",PointB="+pointB); //Point
		
		// Constant or final Variable = variable that cannot be reassigned
		// Syntax
		final byte DAY_OF_THE_WEEK;
		final short NUMBER_OF_MONTH = 12;
		final double PI = 3.14;
		
		DAY_OF_THE_WEEK = 7;
		
		System.out.println(NUMBER_OF_MONTH+PI);
		
		// Naming Convention
		// Class name = Pascal case
		// Variable and Method name = Camel case
		// Final Variable/ Constant = SCREAMING_SNAKE_CASE
		
		
	
		
		
		
		
		
		
		
				
		
		

	}

}
