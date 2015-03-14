package raspberry.gui;

import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * This is the First panel, it serves as a welcome page when the user boots up the GUI
 */

public class WelcomePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePanel() throws IOException {
		setBackground(new Color(210, 180, 140));

		// defines what size the panel is
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(800, 480));
		setLayout(null);
		
		//Welcome Image
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/raspberry/gui/welcome.png"));
		lblNewLabel.setBounds(175, 42, 450, 238);
		add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 51, 0));
		panel_1.setBounds(10, 50, 780, 233);
		add(panel_1);

		// the start button is located in the MainGUI

	}// end WelcomePanel()
}// end class
