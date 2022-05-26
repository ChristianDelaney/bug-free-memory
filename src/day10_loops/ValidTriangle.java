package day10_loops;

public class ValidTriangle {

	public static void main(String[] args) {

		int angleA = 40;
		int angleB = 60;
		int angleC = 80;

		int sum = angleA + angleB + angleC;

		if (sum == 180) {
			System.out.println("this is a valid triangle");

		} else {
			System.out.println("this is not a valid triangle");
		}

	}

}
