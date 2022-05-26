package day13_String;

public class StringEqualityMethod {

	public static void main(String[] args) {

		String word1 = "Hello";
		String word2 = "hello";
		String word3 = "raiders";
		String team = "Raiders";

		boolean a = word1.equals(word2);

		a = word1.equalsIgnoreCase(word2);

		boolean b = "Raiders".equals("Raiders");

		b = "raiders".equals("Raiders");

		b = "Raiders".equalsIgnoreCase(word3);

		if (team.equalsIgnoreCase("raiders")) {

			System.out.println("Go you " + team);
		}

		System.out.println(a);
	}

}
