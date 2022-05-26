package day14_StringReview;


public class StringTask5 {

	public static void main(String[] args) {
		
		String email = "coolkicks@gmail.com";
		String atsign = "@";
		String dot = ".";
		
		boolean hasAtChar = email.contains(atsign);
		
		boolean hasDotChar = email.contains(dot);
		
		boolean indexOfAt = email.indexOf('@') > 0 && email.indexOf('@') < email.lastIndexOf('.');
		
		
		if (hasAtChar && hasDotChar && indexOfAt) {
			System.out.println(true);
		}else {System.out.println(false);
		}

	
	


	}

}
