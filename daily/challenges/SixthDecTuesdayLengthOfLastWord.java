package daily.challenges;

public class SixthDecTuesdayLengthOfLastWord {

	public static void main(String[] args) {
		String str = "Hello World";
		String [] split_word = str.split(" ");
		System.out.println(split_word[split_word.length-1].length());

	}
}
