package day11_review;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int count = 0;
		int number = 34567886;
		int startNumber = number;
		
		while (number != 0) {
			
			number = number / 10;
			count++;
		}

		System.out.printf("%s has %s digits",startNumber,count);
		
	}

}
