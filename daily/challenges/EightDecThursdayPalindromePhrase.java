package daily.challenges;

public class EightDecThursdayPalindromePhrase {

	public static void main(String[] args) {
		String txt = "race a car";
		String rev="";
		String s = txt.toLowerCase();
		String s1 = s.replaceAll("//s", "");
		String s2 = s1.replace("[^0-9a-z]", "");
		char[] charArray = s2.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			rev = rev+charArray[i];

		}
		if(rev.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
