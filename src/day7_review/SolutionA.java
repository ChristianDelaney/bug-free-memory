package day7_review;

import java.util.Scanner;

public class SolutionA {

	public static void main(String[] args) {
		
		
		/*## Task - A

- you should create a new class called `Solution_A`
  Write program that can check the order of the 3 integer inputs. if the order that input integer
  are in descending order (high -> low). the program should return `true`, otherwise return `false`

Input 1
> 185 178 172

Output 1
> true

Input 2
> 181 184 177

Output 2
> false
		  */
		Scanner s = new Scanner(System.in);
		int numA = s.nextInt();
		int numB = s.nextInt();
		int numC = s.nextInt();
		 
			 if (numA > numB && numB > numC) {
				 System.out.println("true");}
			 if (numA < numB && numB < numC) {
				 System.out.println("false");}
			 
			 
		int numD = s.nextInt();
		int numE = s.nextInt();
		int numF = s.nextInt();
		
		
		    if (numD > numE && numE > numF) {
			 System.out.println("true");}
		    if (numD < numE && numE < numF) {
			 System.out.println("false");}
			
		
		
		s.close();
		
		

	}

}
