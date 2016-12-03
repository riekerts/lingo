package nl.riekerts;

import javax.swing.*;
import java.awt.*;

public class WordPanel extends JPanel {

	private String[] theWord;
	private String[] userInput;
	private String[] results;
	private Boolean input = false;

	public void setTheWord(String[] s) {
		theWord = s;
	}

	public void setUserInput(String s) {
		userInput = s.split("");
	}

	public void setResults(String[] s) {
		results = s;
	}

	public void setInput(Boolean b) {
		input = b;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		int width = this.getWidth();
		int height = this.getHeight();

		Color correctPosition = new Color(200,69,0);
		Color correctLetter = new Color(200,200,0);
		Color userLetter = new Color(0,0,200);
		Color fontColor = new Color(240,240,240);
		Font theFont = new Font("Monospaced", Font.BOLD, (width/20));
		g2d.setFont(theFont);

		if (!input) {
			g2d.setColor(correctPosition);
			g2d.fillOval(((width/20)*3),(height/2 - width/20),(width/10),(width/10));
			g2d.setColor(userLetter);
			g2d.fillOval(((width/20)*6),(height/2 - width/20),(width/10),(width/10));
			g2d.fillOval(((width/20)*9),(height/2 - width/20),(width/10),(width/10));
			g2d.fillOval(((width/20)*12),(height/2 - width/20),(width/10),(width/10));
			g2d.fillOval(((width/20)*15),(height/2 - width/20),(width/10),(width/10));

			g2d.setColor(fontColor);
			g2d.drawString(theWord[0], ((width/20)*4), (height/2));
		} else {
			for (int i = 0; i < 5; i++) {
				if (results[i] == "correct") {
					g2d.setColor(correctPosition);
				} else if (results[i] == "wrong position") {
					g2d.setColor(correctLetter);
				} else if (results[i] == "does not occur") {
					g2d.setColor(userLetter);
				}
				g2d.fillOval(((width/20)*((i*3)+3)),(height/2 - width/20),(width/10),(width/10));
			}
			g2d.setColor(fontColor);
			g2d.drawString(userInput[0], ((width/20)*4), (height/2));
			g2d.drawString(userInput[1], ((width/20)*7), (height/2));
			g2d.drawString(userInput[2], ((width/20)*10), (height/2));
			g2d.drawString(userInput[3], ((width/20)*13), (height/2));
			g2d.drawString(userInput[4], ((width/20)*16), (height/2));
		}

	}
}