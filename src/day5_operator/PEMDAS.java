package day5_operator;

public class PEMDAS {

	public static void main(String[] args) {
		
		/*PEMDAS 
		 * (Parenthesis, Exponents, Multiplication and Division, Addition and Subtraction) 
		 * order. When there are multiple instances of the same precedence, 
		 * Java reads from left to right.
		 **/

		int result = 1+2+3-4;
		
		System.out.println(result);
		
        result = 1+2+(3-4);
		
		System.out.println(result);
		
		result = 1+2+3*4;
		
		System.out.println(result);
		
		result = 11 - 4*3 + (10/2)*5 +8;
		
		// 11 - 12 + 25 + 8 = 32
		
		System.out.println(result);
		
		int result1 = 1+8*10+6+6;
		
		System.out.println(result1);
		
		result1 = 1+8*10/5+6;
		
		System.out.println(result1);

		
		
		
		
		
		
		
		
	}

}
