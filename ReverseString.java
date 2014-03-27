public class ReverseString {
	public static void main(String[]args) {
		String sentence = args[0];
		char[] letters = sentence.toCharArray();

		for (int i = 0;i<letters.length/2;i++) {
			char tempLetter = letters[i];
			letters[i] = letters[letters.length-1-i];
			letters[letters.length-1-i] = tempLetter;
		}


		System.out.println(new String(letters));
	}
}