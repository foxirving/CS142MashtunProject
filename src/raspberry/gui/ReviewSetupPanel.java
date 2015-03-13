package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;

import java.awt.SystemColor;

/*
 * This panel is shown after the 'setup' panel,
 * it shows the user what information that was input into the program
 */

public class ReviewSetupPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReviewSetupPanel(){
		
		/**
		 * need to find a good way to format this panel. \('o')\
		 */
		
		//defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		setSize(new Dimension(800, 480));
		setBackground(new Color(255, 248, 220));
		
		//Start over button, clears the variables and takes the user back to the welcome panel
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		btnCancel.setForeground(new Color(51, 0, 0));
		btnCancel.setBackground(new Color(153, 51, 51));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnCancel.setBorder(emptyBorder);
		btnCancel.setBounds(0, 375, 400, 105);
		add(btnCancel);
		
		//Start button, begins the program
		
//		JButton btnStartProcess = new JButton("Start Process");
//		btnStartProcess.setBounds(400, 374, 400, 106);
//		add(btnStartProcess);
		
		
	}//end ReviewSetupPanel()

}//end class
