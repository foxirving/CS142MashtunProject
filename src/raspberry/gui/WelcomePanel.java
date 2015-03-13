package raspberry.gui;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

/*
 * This is the First panel, it serves as a welcome page when the user boots up the GUI
 */

public class WelcomePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePanel() {
		setBackground(new Color(255, 228, 181));

		// defines what size the panel is
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(800, 480));
		setLayout(null);

		//the "welcome' text
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		txtrWelcome.setText("Welcome");
		txtrWelcome.setBounds(255, 101, 290, 149);
		add(txtrWelcome);

		// the start button is located in the MainGUI

	}// end WelcomePanel()
}// end class
