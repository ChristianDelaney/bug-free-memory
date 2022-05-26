package day7_review;



public class HomeworkTask7 {

	public static void main(String[] args) {
		
		boolean usCitizen = true;
		int age = 17;
		boolean registered = true;
		
		if (usCitizen == true){
			
			if (age >= 18) {
				
				if (registered == true) {
					System.out.println("you are eligible to vote");
				}else { 
					System.out.println("you must be a registered in your state to vote");
				
				}
			
			}else {System.out.println("you must be 18 or older to vote");
			
			}
		
	} else {System.out.println("you must be a US citizen to vote");
	
	
			
	}
	
	}
	
}

	


