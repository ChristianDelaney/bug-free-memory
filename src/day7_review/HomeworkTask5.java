package day7_review;

import java.util.Scanner;

public class HomeworkTask5 {

	public static void main(String[] args) {
		
		Scanner Day = new Scanner(System.in);
		
		
		System.out.println("Type your number:");

		int a = Day.nextInt();
		System.out.println(Day);
		
		    if (a >= 5 && a <= 12) {
		    	System.out.println("Good Morning");
		    
		    }else if(a >= 13 && a<= 17)
		    {System.out.println("Good Afternoon");	    	
		    
		    }else if(a >= 18 && a <= 24)
		    {System.out.println("Good Evening");	    	
		    
		    }else {System.out.println("enter a valid time");}
	}

}
