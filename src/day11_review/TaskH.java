package day11_review;

public class TaskH {

	public static void main(String[] args) {

		int style_Me = 1;
		int style_Date = 1;

		if (style_Me <= 2 || style_Date <= 2) {
			System.out.println("sorry, no table for you. Graduate boot camp first");
		} else if (style_Me >= 8 || style_Date >= 8) {
			System.out.println("Yes, you noth will gert a table");
		} else {
			System.out.println("Ahh you may be lucky tonight");
		}

	}

}
