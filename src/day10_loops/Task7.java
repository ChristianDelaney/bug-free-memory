package day10_loops;

public class Task7 {
	
	public static void main(String[] args) {
		
		int result = 1;
		
		
		for (int i = 10;i >=1;i--) {
			System.out.println(i);
			result = result * i;
			
		}
		System.out.println(result);
	}

}
