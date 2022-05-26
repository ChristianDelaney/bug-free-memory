package day6_controlFlow;

import java.util.Scanner;

public class OmittingElsePart {

	public static void main(String[] args) {
		
		int a =4;
		
		if (a % 2 == 1) {
			
			System.out.println(a +" is odd number");
		}
		
       if (a % 2 == 0) {
			
			System.out.println(a +" is even number");
		}
		
		
	       System.out.println("line #15");
	       
	       
	       
	       int n1 = 300;
	       int n2 = 300;
	       
	       if (n1 >= n2) {System.out.println("Max # is"+n1);}
	       System.out.println("min # is "+n2);
	       
	       if (n1<=n2) {System.out.println("max # is"+n2);}
	       System.out.println("min # is "+n1);
	       
	       
	       if (n1==n2 ) {System.out.println("they are equal");}
	       
	       int bathTempurature = 90;
	       
	       if( bathTempurature < 90 ) {System.out.println("too cold");}
	       
	       if(bathTempurature > 90) {System.out.println("turn down some");}
	       
	       if(bathTempurature == 90 && bathTempurature <1000) {System.out.println("just right");}
	       
	       if(bathTempurature == 0)  {System.out.println("turn on to 90 degrees");}
	       
	       
	       
	    
	       
	      
	       
	       
	    

	}

}
