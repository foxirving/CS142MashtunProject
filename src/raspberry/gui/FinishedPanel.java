package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 * This panels shows after the 'in process' panel is complete
 */

public class FinishedPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FinishedPanel() {
		
		// defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);
		setBackground(new Color(210, 180, 140));
		
		//Finished Image
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/raspberry/gui/complete.png"));
		lblNewLabel.setBounds(175, 42, 450, 238);
		add(lblNewLabel);
		
		//Done button located in the MainGUI

	}//end FinishedPanel()
}//end class
