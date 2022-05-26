package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {
		
		String str = "Television";
		
	System.out.println(str.substring(4));
	System.out.println(str.substring(2, 5));
	
	String str1 = "Immutable";
	System.out.println(str1.substring(4));
	System.out.println(str1.substring(4, 9));
	
	String email = "firstname.lastname@gmail.com";
	
	System.out.println(email.indexOf('g'));
	System.out.println(email.lastIndexOf('.'));
	
	System.out.println(email.substring(19,24));
	
	
	
	
	
	
	

	}

}
