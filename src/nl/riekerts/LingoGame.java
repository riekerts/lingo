package nl.riekerts;

public class LingoGame {

	public static void main(String[] args) {
		LingoWord lingoWord = new LingoWord();
		lingoWord.createNewWord();

		String[] result = lingoWord.checkWord("vloer");

		System.out.println(result[0] + ", " + result[1] + " " + result[2] + ", " + result[3] + ", " + result[4]);
	}
}