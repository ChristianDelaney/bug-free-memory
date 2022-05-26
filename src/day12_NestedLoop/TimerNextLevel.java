package day12_NestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.out.println("timer Start!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how long do you wan to wait for? ");
		
		int waitTime = scan.nextInt();
		
		for (int i = waitTime; i >= 0; i--) {
			System.out.println(i);

			for (int j = 59; j >= 0; j--) {

				System.out.println(i + ":" + j);
				Thread.sleep(1000);
			}

		}

		System.err.println("Time's UP!!!!");
		
		
		
		
		
		

	}

}
