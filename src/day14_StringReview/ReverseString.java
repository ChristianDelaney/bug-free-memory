package day14_StringReview;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "lo";
		
		
		if (a.length() > 5) {
			System.out.println("Too Long");
			
		}else if (a.length() < 5) {
			System.out.println("Too Short");
			
		}else {
		
		System.out.print(a.charAt(4));
		System.out.print(a.charAt(3));
		System.out.print(a.charAt(2));
		System.out.print(a.charAt(1));
		System.out.print(a.charAt(0));
		}
	}

}
