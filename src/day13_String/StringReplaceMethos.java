package day13_String;

public class StringReplaceMethos {

	public static void main(String[] args) {
		
 String word = "carcar";
 
 word = word.replace('r','t');
 
 System.out.println(word);
 
 String str = "tomato";
 
 str = str.replace('t','r');
 
 String str2 = "today I went to the supermarket to buy milk";
 
 str2 = str2.replace("milk", "100,000 eggs");
 
 System.out.println(str2);
 
 str2 = str2.replace(" ", "");
 
 System.out.println(str2);

	}

}
