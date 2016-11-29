public class LingoWord {
	private String word;
	private String[] words = {"plaat", "talen", "vloer", "kopje"};

	public void createNewWord() {
		word = words[(int) (Math.random() * words.length)];
		System.out.println("Random word: " + word);
	}

	public String[] checkWord(String word) {
		String[] resultByLetter = {"correct", "does not occur", "wrong position", "correct", "correct"};
		return resultByLetter;
	}
}