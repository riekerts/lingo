package nl.riekerts;

/*
public enum Letter {
    CORRECT, NOTHERE, INCORRECT 
} */

public class LingoWord {
	private String randomWord;
	private String[] words = {"plaat", "talen", "vloer", "kopje"};

	public void createNewWord() {
		randomWord = words[(int) (Math.random() * words.length)];
		System.out.println("Random word: " + randomWord);
	}

	public String[] getLetters() {
		String[] lettersCurrentWord = randomWord.split("");
		return lettersCurrentWord;
	}

	public String[] checkWord(String word) {
		String[] lettersInput = word.split("");
		//String[] lettersInput = {"v", "l", "o", "e", "r"};
		String[] lettersCurrentWord = randomWord.split("");
		String[] resultByLetter = new String[5];
		//System.out.println(lettersInput);
		for(int i = 0;i < 5; i++){
			if(lettersInput[i].equals(lettersCurrentWord[i])) {
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