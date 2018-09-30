import java.awt.List;
import java.util.ArrayList;

public class Abbreviate {
	public static String abbreviate(String sentence) {
		String delimiter = " ";
		String words[] = sentence.split(delimiter);
		ArrayList<String> result = new ArrayList<String>();
		
		for(String word : words) {
			if(word.length() > 4) {
				result.add(word.replaceAll("[AEIOUaeiou]", ""));
			} else {
				result.add(word);
			}
		}
		
		return String.join(" ", result);
		
	}
	
	public static void main(String[] args) {
		String result = Abbreviate.abbreviate("bootcamp is very good");
		System.out.println(result);
	}

}
