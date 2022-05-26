package day7_review;

public class DrecementAndIncrementOperator {

	public static void main(String[] args) {
		/// Prefix and Postfix

		int x = 1;
		int y = x++;
	
		System.out.println(x +" = " +y);
		
		int i = 1;
		int j = ++i;
		
		System.out.println(i+" = "+ j);
		
		//increment and decrement with char
		char a = 'a';
		char b = 'b';
		char c = 'c';
		
		char ch = 'c';
		ch-= 'b';
		ch+= 'c';
		
		System.out.println(ch);
		
		
		
	}
}
