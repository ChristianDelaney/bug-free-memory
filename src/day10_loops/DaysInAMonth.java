package day10_loops;

public class DaysInAMonth {

	public static void main(String[] args) {
		
		int month = 2;
		
	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("this month has 31 days in it");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("this month has 30 days in it");
		break;
	case 2:
			System.out.println("this month has 28 days in it");
		
	}
			
			
		
	}

}
