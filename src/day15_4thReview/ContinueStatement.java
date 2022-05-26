package day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {
		
		int n = 140;
		
		for (int i = 0;i < n;i++) {
			if (i % 2 != 0) {
				continue; // goes back to line 10 to see if number is even or odd
			}
			System.out.print(i+" ");
		}

		
		for (int i = 0;i < n;i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
			
	}
	}
}
