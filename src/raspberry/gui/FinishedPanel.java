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
	
	public FinishedPanel() {
		
		// defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);
		setBackground(new Color(210, 180, 140));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\amy\\eclikspe_workspace\\FinalProject\\src\\raspberry\\gui\\complete.png"));
		lblNewLabel.setBounds(175, 42, 450, 238);
		add(lblNewLabel);
		
		
		// done button, this button will put the user back at the welcome panel
		
//		JButton btnDone = new JButton("Done");
//		btnDone.setBounds(200, 363, 400, 106);
//		add(btnDone);
//		

	}//end FinishedPanel()
}//end class
