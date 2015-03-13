package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.border.Border;
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
			setBackground(new Color(210, 180, 140));

			// Layer pane that contains all the numbers

			JLayeredPane layeredPaneThree = new JLayeredPane();
			layeredPaneThree.setBounds(0, 0, 800, 480);
			add(layeredPaneThree);
			
			
//			JTextArea txtrHowManySteps = new JTextArea();
//			txtrHowManySteps.setFocusable(false);
//			txtrHowManySteps.setForeground(Color.WHITE);
//			txtrHowManySteps.setBackground(Color.GRAY);
//			txtrHowManySteps.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
//			txtrHowManySteps.setText("How many steps for this mash?");
//			txtrHowManySteps.setLineWrap(true);
//			txtrHowManySteps.setBounds(5, 72, 394, 112);
//			layeredPaneThree.add(txtrHowManySteps);
			
//			final JTextArea txtArea = new JTextArea();
//			txtArea.setBorder(new LineBorder(new Color(0, 0, 0)));
//			txtArea.setForeground(SystemColor.textHighlight);
//			txtArea.setBackground(new Color(255, 248, 220));
//			txtArea.setFont(new Font("Lucida Grande", Font.PLAIN, 47));
//			txtArea.setBounds(17, 360, 373, 119);
//			layeredPaneThree.add(txtArea);
			

			// button one

			JButton btnOne = new JButton("1");
			btnOne.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnOne.setForeground(new Color(51, 0, 0));
			btnOne.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("1");
				}
			});
			btnOne.setBackground(new Color(255, 248, 220));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnOne.setBorder(emptyBorder);
			btnOne.setBounds(400, 0, 133, 119);
			layeredPaneThree.add(btnOne);

			// button two

			JButton btnTwo = new JButton("2");
			btnTwo.setForeground(new Color(51, 0, 0));
			btnTwo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("2");
				}
			});
			btnTwo.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnTwo.setBorder(emptyBorder);
			btnTwo.setBackground(new Color(255, 228, 196));
			btnTwo.setBounds(534, 0, 133, 119);
			layeredPaneThree.add(btnTwo);

			// button three

			JButton btnThree = new JButton("3");
			btnThree.setForeground(new Color(51, 0, 0));
			btnThree.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("3");
				}
			});
			btnThree.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnThree.setBorder(emptyBorder);
			btnThree.setBackground(new Color(255, 248, 220));
			btnThree.setBounds(667, 0, 133, 119);
			layeredPaneThree.add(btnThree);

			// button four

			JButton btnFour = new JButton("4");
			btnFour.setForeground(new Color(51, 0, 0));
			btnFour.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnFour.setBorder(emptyBorder);
			btnFour.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("4");
				}
			});
			btnFour.setBackground(new Color(255, 228, 196));
			btnFour.setBounds(400, 120, 133, 119);
			layeredPaneThree.add(btnFour);

			// button five

			JButton btnFive = new JButton("5");
			btnFive.setForeground(new Color(51, 0, 0));
			btnFive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("5");
				}
			});
			btnFive.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnFive.setBorder(emptyBorder);
			btnFive.setBackground(new Color(255, 248, 220));
			btnFive.setBounds(534, 120, 133, 119);
			layeredPaneThree.add(btnFive);

			// button six

			JButton btnSix = new JButton("6");
			btnSix.setForeground(new Color(51, 0, 0));
			btnSix.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("6");
				}
			});
			btnSix.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnSix.setBorder(emptyBorder);
			btnSix.setBackground(new Color(255, 228, 196));
			btnSix.setBounds(667, 120, 133, 119);
			layeredPaneThree.add(btnSix);

			// button seven

			JButton btnSeven = new JButton("7");
			btnSeven.setForeground(new Color(51, 0, 0));
			btnSeven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("7");
				}
			});
			btnSeven.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnSeven.setBorder(emptyBorder);
			btnSeven.setBackground(new Color(255, 248, 220));
			btnSeven.setBounds(400, 241, 133, 119);
			layeredPaneThree.add(btnSeven);

			// button eight

			JButton btnEight = new JButton("8");
			btnEight.setForeground(new Color(51, 0, 0));
			btnEight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("8");
				}
			});
			btnEight.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnEight.setBorder(emptyBorder);
			btnEight.setBackground(new Color(255, 228, 196));
			btnEight.setBounds(534, 241, 133, 119);
			layeredPaneThree.add(btnEight);

			// button nine

			JButton btnNine = new JButton("9");
			btnNine.setForeground(new Color(51, 0, 0));
			btnNine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("9");
				}
			});
			btnNine.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnNine.setBorder(emptyBorder);
			btnNine.setBackground(new Color(255, 248, 220));
			btnNine.setBounds(667, 241, 133, 119);
			layeredPaneThree.add(btnNine);

			// button zero

			JButton btnZero = new JButton("0");
			btnZero.setForeground(new Color(51, 0, 0));
			btnZero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.append("0");
				}
			});
			btnZero.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 36));
			btnZero.setBorder(emptyBorder);
			btnZero.setBackground(new Color(255, 248, 220));
			btnZero.setBounds(534, 360, 133, 119);
			layeredPaneThree.add(btnZero);
			
			// clear button

			JButton btnClear = new JButton("Clear");
			btnClear.setForeground(new Color(51, 0, 0));
			btnClear.setBackground(new Color(153, 51, 51));
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtArea.setText("");
				}
			});
			btnClear.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 36));
			btnClear.setBorder(emptyBorder);
			btnClear.setBounds(400, 360, 133, 119);
			layeredPaneThree.add(btnClear);
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 380, 458);
			layeredPaneThree.add(panel);
			
//			JPanel panelNumbBackground = new JPanel();
//			panelNumbBackground.setBounds(400, 0, 400, 480);
//			add(panelNumbBackground);
//			panelNumbBackground.setBackground(new Color(255, 248, 220));
//			layeredPaneThree.setVisible(true);
			
			
			
			
					
			/**
			 * The enter button is located in the MainGUI
			 */
			
			

	}// end SetupPanel()
}// end class
