package raspberry.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

/*
 * This panel tells the user what information is needed to be input for the program to start
 */

public class SetupPanel extends JPanel {
	private final JLayeredPane LayeredPaneTwo = new JLayeredPane();
	private final JLayeredPane LayeredPaneOne = new JLayeredPane();
	private JTextField txtBoxNumber;
	private JTextField txtBoxQuestion;

	public SetupPanel() {

		//defines what size the panel is
		
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);

		// Layer pane that contains all the numbers

		JLayeredPane layeredPaneThree = new JLayeredPane();
		layeredPaneThree.setBounds(400, 0, 400, 480);
		add(layeredPaneThree);

		// button one

		JButton btnOne = new JButton("1");
		btnOne.setBounds(0, 0, 133, 119);
		layeredPaneThree.add(btnOne);

		// button two

		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(134, 0, 133, 119);
		layeredPaneThree.add(btnTwo);

		// button three

		JButton btnThree = new JButton("3");
		btnThree.setBounds(267, 0, 133, 119);
		layeredPaneThree.add(btnThree);

		// button four

		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFour.setBounds(0, 120, 133, 119);
		layeredPaneThree.add(btnFour);

		// button five

		JButton btnFive = new JButton("5");
		btnFive.setBounds(134, 120, 133, 119);
		layeredPaneThree.add(btnFive);

		// button six

		JButton btnSix = new JButton("6");
		btnSix.setBounds(267, 120, 133, 119);
		layeredPaneThree.add(btnSix);

		// button seven

		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(0, 241, 133, 119);
		layeredPaneThree.add(btnSeven);

		// button eight

		JButton btnEight = new JButton("8");
		btnEight.setBounds(134, 241, 133, 119);
		layeredPaneThree.add(btnEight);

		// button nine

		JButton btnNine = new JButton("9");
		btnNine.setBounds(267, 241, 133, 119);
		layeredPaneThree.add(btnNine);

		// button zero

		JButton btnZero = new JButton("0");
		btnZero.setBounds(134, 360, 133, 119);
		layeredPaneThree.add(btnZero);

		// layer pane that contains 'enter' and 'clear' button

		LayeredPaneTwo.setBounds(0, 241, 400, 240);
		add(LayeredPaneTwo);

		// enter Button

		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(0, 0, 400, 119);
		LayeredPaneTwo.add(btnEnter);

		// clear button

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(0, 121, 400, 119);
		LayeredPaneTwo.add(btnClear);

		// layer pane that contains the text boxes

		LayeredPaneOne.setBounds(0, 0, 400, 240);
		add(LayeredPaneOne);

		// text box that contains the question for the user
		
		txtBoxQuestion = new JTextField();
		txtBoxQuestion.setText("this is where the queastion goes");
		txtBoxQuestion.setColumns(10);
		txtBoxQuestion.setBounds(10, 11, 380, 106);
		LayeredPaneOne.add(txtBoxQuestion);
		
		// text box that contains the input number

		txtBoxNumber = new JTextField();
		txtBoxNumber.setText("this is where the numbers goes");
		txtBoxNumber.setBounds(10, 123, 380, 106);
		LayeredPaneOne.add(txtBoxNumber);
		txtBoxNumber.setColumns(10);


	}// end SetupPanel()
}// end class
