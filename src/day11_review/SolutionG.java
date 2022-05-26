package day11_review;

public class SolutionG {

	public static void main(String[] args) {

		int n = 5;

		if (n % 2 != 0) { // if n is odd

			System.out.println("Weird");
		} else { // if n is even

			if (n >= 2 && n <= 5) {
				System.out.println("Not weird");
			}

			if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			}

			if (n > 20) {
				System.out.println("Not weird");
			}

		}

	}

}
