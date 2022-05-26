package day9_switchstaements;

public class SwitchSatementsWithoutBreakStatement {

	public static void main(String[] args) {

		String browser = "edge";
		switch (browser) {
		case "chrome":
		case "firefox":
		case "opera":
		case "safari":
		case "edge":
			System.out.println(browser+" browser is selected");
			break;
	
			
			default: System.out.println("invalid browser");

		}
	}

}
