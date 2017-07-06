package lesson8;

public class HomeWork_1 {
	/*
	 * Enter in the console sentence of five words. display the longest word in
	 * the sentence determine the number of its letters; bring the second word in
	 * reverse order
	 */
	public static void determineLongestWord(String[] array) {
		String temp = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > temp.length()) {
				temp = array[i];
				System.out.printf("The longest word in the sentence is ''%s'' and it consist of %d letters\n", temp,
						temp.length());
			}
		}
	}

	public static void reverse(String string) {
		char[] word = string.toCharArray();
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.printf("%c", word[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String s = new StringBuilder("The").append(" morning").append(" sky").append(" was").append(" grey").toString();
		String[] sentence = s.split(" ");

		HomeWork_1.determineLongestWord(sentence);

		HomeWork_1.reverse(sentence[1]);

	}

}
