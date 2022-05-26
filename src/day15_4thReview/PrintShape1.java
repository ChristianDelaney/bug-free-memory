package day15_4thReview;

public class PrintShape1 {

	public static void main(String[] args) {
		for (int i = 1;i<=5;i++) {
            for (int j =1;j<=5;j++) {
            System.out.print('*');}
            
            System.out.println(" ");
			
		}
		
		
		
		 char star = '*';
	      char space = ' ';
	      int n = 5;

	      for (int i = 0; i < n; i++) { // run 5 times
	         // space loop                 
	         for (int j = i; j < n-1; j++) {
	            System.out.print(space);
	         }

	         // star loop
	         for (int j = 0; j < n; j++) { // run 5 times
	            System.out.print(star); // print 5 stars
	         }

	         System.out.println();
	      }

	      char stars = '*';
	      char spaces = ' ';
	      int l = 5;

	      for (int i = 0; i < l; i++) { // run 5 times

//	       // space loop
	         for (int j = 0; j < i; j++) {
	            System.out.print(spaces);
	         }

	         // star loop
	         for (int j = 0; j < n; j++) { // run 5 times
	            System.out.print(stars); // print 5 stars
	         }

	         System.out.println();
	      }
	      
	}

}
