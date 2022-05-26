package day6_controlFlow;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		double minimumSalary = 30000;
		int jobHistory = 2;
		int creditScore = 680;
		
		if (minimumSalary >= 30000) {

			if (jobHistory >= 2) {

				if (creditScore >= 680) {
					System.out.println("You are qualified for a loan");
				} else {
					System.out.println("You must have atleast 680 credit score");

				}
			} else {
				System.out.println("you must be on the job for atleast 2 years");

			}

		} else {
			System.out.println("you must have a minumum of 30k salary first");
	    	
	    	
	    	
	    		
	    	
	    	
	    }
		
		}

	}


