package day6_controlFlow;

import java.util.Scanner;

public class BathTempurature {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int bathTempurature = scan.nextInt();
		
		System.out.println("what is the bath temp?");
	
		int s = scan.nextInt();
		
		if( bathTempurature < 90 ) {System.out.println("too cold");}
	       
	       if(bathTempurature > 90) {System.out.println("turn down some");}
	       
	       if(bathTempurature == 90 && bathTempurature <1000) {System.out.println("just right");}
	       
	       if(bathTempurature == 0)  {System.out.println("turn on to 90 degrees");}
	       
	       
	       
		

	}

}
