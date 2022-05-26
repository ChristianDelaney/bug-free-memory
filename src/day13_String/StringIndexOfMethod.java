package day13_String;

public class StringIndexOfMethod {

	public static void main(String[] args) {
		
		String name = "President George Washington";
		
		System.out.println(name.indexOf('P'));
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf("George"));
		System.out.println(name.indexOf('e', 3));
		System.out.println(name.indexOf('e', 9));
		System.out.println(name.indexOf("Bob"));
		System.out.println(name.lastIndexOf('e'));
		

	}

}
