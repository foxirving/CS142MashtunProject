package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLayeredPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.border.LineBorder;

/*
 * This panel tells the user what information is needed to be input for the program to start
 */

public class SetupPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private final JLayeredPane LayeredPaneTwo = new JLayeredPane();
	private final JLayeredPane LayeredPaneOne = new JLayeredPane();
	private JTextField txtBoxNumber;
	private JTextField txtBoxQuestion;
	
	String txtPass = "1337";

		public SetupPanel() {

			//defines what size the panel is
			
			setBackground(SystemColor.inactiveCaption);
			setSize(new Dimension(800, 480));
			setLayout(null);

			// Layer pane that contains all the numbers

			JLayeredPane layeredPaneThree = new JLayeredPane();
			layeredPaneThree.setBounds(0, 0, 800, 480);
			add(layeredPaneThree);
			
			JTextArea txtrHowManySteps = new JTextArea();
			txtrHowManySteps.setFocusable(false);
			txtrHowManySteps.setForeground(Color.WHITE);
			txtrHowManySteps.setBackground(Color.GRAY);
			txtrHowManySteps.setFont(new Font("Lucida Grande", Font.PLAIN, 47));
			txtrHowManySteps.setText("How many steps for this mash?");
			txtrHowManySteps.setLineWrap(true);
			txtrHowManySteps.setBounds(5, 72, 394, 112);
			layeredPaneThree.add(txtrHowManySteps);
			
			final JTextArea txtArea = new JTextArea();
			txtArea.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtArea.setForeground(SystemColor.textHighlight);
			txtArea.setBackground(Color.WHITE);
			txtArea.setFont(new Font("Lucida Grande", Font.PLAIN, 47));
			txtArea.setBounds(5, 244, 373, 65);
			layeredPaneThree.add(txtArea);
			

			// button one

			JButton btnOne = new JButton("1");
			btnOne.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnOne.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("1");
				}
			});
			btnOne.setBounds(400, 0, 133, 119);
			layeredPaneThree.add(btnOne);

			// button two

			JButton btnTwo = new JButton("2");
			btnTwo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("2");
				}
			});
			btnTwo.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnTwo.setBounds(534, 0, 133, 119);
			layeredPaneThree.add(btnTwo);

			// button three

			JButton btnThree = new JButton("3");
			btnThree.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("3");
				}
			});
			btnThree.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnThree.setBounds(667, 0, 133, 119);
			layeredPaneThree.add(btnThree);

			// button four

			JButton btnFour = new JButton("4");
			btnFour.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnFour.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("4");
				}
			});
			btnFour.setBounds(400, 120, 133, 119);
			layeredPaneThree.add(btnFour);

			// button five

			JButton btnFive = new JButton("5");
			btnFive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("5");
				}
			});
			btnFive.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnFive.setBounds(534, 120, 133, 119);
			layeredPaneThree.add(btnFive);

			// button six

			JButton btnSix = new JButton("6");
			btnSix.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("6");
				}
			});
			btnSix.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnSix.setBounds(667, 120, 133, 119);
			layeredPaneThree.add(btnSix);

			// button seven

			JButton btnSeven = new JButton("7");
			btnSeven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("7");
				}
			});
			btnSeven.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnSeven.setBounds(400, 241, 133, 119);
			layeredPaneThree.add(btnSeven);

			// button eight

			JButton btnEight = new JButton("8");
			btnEight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("8");
				}
			});
			btnEight.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnEight.setBounds(534, 241, 133, 119);
			layeredPaneThree.add(btnEight);

			// button nine

			JButton btnNine = new JButton("9");
			btnNine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("9");
				}
			});
			btnNine.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnNine.setBounds(667, 241, 133, 119);
			layeredPaneThree.add(btnNine);

			// button zero

			JButton btnZero = new JButton("0");
			btnZero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("0");
				}
			});
			btnZero.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnZero.setBounds(534, 360, 133, 119);
			layeredPaneThree.add(btnZero);
			
			// clear button

			JButton btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.setText("");
				}
			});
			btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			btnClear.setBounds(400, 360, 133, 119);
			layeredPaneThree.add(btnClear);
					
			/**
			 * The enter button is located in the MainGUI
			 */
			
			

	}// end SetupPanel()
}// end class
