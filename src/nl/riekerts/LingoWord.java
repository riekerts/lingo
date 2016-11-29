package nl.riekerts;

public class LingoWord {
	private String randomWord;
	private String[] words = {"plaat", "talen", "vloer", "kopje"};

	public void createNewWord() {
		randomWord = words[(int) (Math.random() * words.length)];
		System.out.println("Random word: " + randomWord);
	}

	public String[] checkWord(String word) {
		char[] lettersInput = word.toCharArray();
		char[] lettersCurrentWord = randomWord.toCharArray();
		String[] resultByLetter = new String[5];
		System.out.println(lettersInput);
		for(int i = 0;i < 5; i++){
			if(lettersInput[i] == lettersCurrentWord[i]){
				resultByLetter[i] = "correct";
			}
			else if(randomWord.contains(lettersInput[i])) {
				resultByLetter[i] = "wrong position";
			}
			else {
				resultByLetter[i] = "does not occur";
			}
		}

		return resultByLetter;
	}
}