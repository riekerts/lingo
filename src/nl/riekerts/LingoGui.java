/* package nl.riekerts;



public class LingoGui {

	private JFrame mainFrame;
	private JTextField wordInput;

	public void setupGui () {
		mainFrame = new JFrame("Riekerts Lingo");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wordInput = new JTextField(5);
		wordInput.addActionListener(new InputListener());

		mainFrame.getContentPane().add(BorderLayout.SOUTH, wordInput);

		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setUndecorated(true);
		mainFrame.setBackground(new Color(0,0,150,200));
		mainFrame.setVisible(true);
	}

	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String word = wordInput.getText();
			String[] result = lingoWord.checkWord(word);
			System.out.println(result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3] + ", " + result[4]);
			mainFrame.setBackground(new Color(0,150,0,200));
		}
	}
} */