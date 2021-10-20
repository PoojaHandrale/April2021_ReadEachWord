package readWords;

public class ReadEachWord {

	public static void main(String[] args) {

		// Read each word and its possible meanings and print them out.
		String wordArr[] = {" ","Apple", "Table", "Orange" };
		String meaning_1[] = {" ",  "A fruit", "An object", "A fruit" };
		String meaning_2[] = {" ", "A tech firm", "Contains rows and columns when used in context of computers",
				" A color" };

		for (int i = 0; i <= 3; i++) {
			if (i == 0) {
				continue;
			} else {
				System.out.println("Word " + i + ": " + wordArr[i]);
				System.out.println("Meaning 1" + ": " + meaning_1[i]);
				System.out.println("Meaning 2" + ": " + meaning_2[i]);
			}
		}
	}
}
