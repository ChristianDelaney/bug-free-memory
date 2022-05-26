package day10_loops;

public class Task6 {
	
	public static void main(String[] args) {
		for (int a=1;a <101;a++) {
			
			if (a%3==0 && a%5==0) {
				
				System.out.println("FINRA");
			}else if (a%3==0) {
				
				System.out.println("FIN");
			}else if (a%5==0) {
				
				System.out.println("RA");
			}else {System.out.println(a);}
			
			
		}
	}

}
