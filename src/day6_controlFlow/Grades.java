package day6_controlFlow;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		/*
Letter Grade	Percent Grade	4.0 Scale
A+	97-100	4.0
A	93-96	4.0
A-	90-92	3.7
B+	87-89	3.3
B	83-86	3.0
B-	80-82	2.7
C+	77-79	2.3
C	73-76	2.0
C-	70-72	1.7
D+	67-69	1.3
D	65-66	1.0
E/F	Below 65	0.0
		 
		 * 
		 * */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		    int a = s.nextInt();
		    System.out.println(a);
		   
		   
		
		    if (a >=97 && a <= 100) {
		    	System.out.println("A+ grade with a 4.0 gpa");
		    
		    }else if(a >= 93 && a <= 96)
		    {System.out.println("A grade with 4.0 gpa");	    	
		    
		    }else if(a >= 90 && a <= 92)
		    {System.out.println("A- grade with 3.7 gpa");	    	
		    
		    }else if(a >= 87 && a <= 89)
		    {System.out.println("B+ grade with 3.3 gpa");	    	
		    
		    }else if(a >= 83 && a <= 86)
		    {System.out.println("B grade with 3.0 gpa");	    	
		    
		    }else if(a >= 80 && a <= 82)
		    {System.out.println("B- grade with 2.7 gpa");	    	
		    
		    }else if(a >= 77 && a <= 79)
		    {System.out.println("C+ grade with 2.3 gpa");
		    
		    }else if(a >= 73 && a <= 76)
		    {System.out.println("C grade with 2.0 gpa");
		    
		    }else if(a >= 70 && a <= 72)
		    {System.out.println("C- grade with 1.7 gpa");
		    
		    }else if(a >= 67 && a <= 69)
		    {System.out.println("D+ grade with 1.3 gpa");
		    
		    }else if(a >= 65 && a <= 66)
		    {System.out.println("D grade with 1.0 gpa");
		    
		    }else if(a >= 0 && a <= 64)
		    {System.out.println("F grade with 0.0 gpa");
		    
		    }
		    System.out.println("invalid score");
		   
		   
		   
		   
		
	
	}

}
