package nl.riekerts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LingoGame {

	private String[] result;
	private LingoWord lingoWord;
	private JFrame mainFrame;
	private JTextField wordInput;

	public static void main(String[] args) {
		LingoGame game = new LingoGame();
		game.go();
	}

	public void go(){
		lingoWord = new LingoWord();
		setupGui();
		lingoWord.createNewWord();
	}

	public void printResult() {
		System.out.println(result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3] + ", " + result[4]);
	}

	public void setResult(String[] r){
		result = r;
	}

	public String[] getResult() {
		return result;
	}


	public void setupGui () {
		mainFrame = new JFrame("Riekerts Lingo");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setUndecorated(true);
		wordInput = new JTextField(5);
		wordInput.addActionListener(new InputListener());

		mainFrame.getContentPane().add(BorderLayout.SOUTH, wordInput);

		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = env.getDefaultScreenDevice();	
   		device.setFullScreenWindow(mainFrame);
		mainFrame.setBackground(new Color(0,0,150));
		mainFrame.setVisible(true);
	}

	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String word = wordInput.getText();
			result = lingoWord.checkWord(word);
			printResult();
			if (true) {
				mainFrame.setBackground(new Color(0,150,0));
			} else {
				mainFrame.setBackground(new Color(150,0,0));
			}
			wordInput.setText("");
		}
	}
}