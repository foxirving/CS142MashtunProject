package raspberry.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.SystemColor;

/*
 * This panel is shown after the 'setup' panel,
 * it shows the user what information that was input into the program
 */

public class ReviewSetupPanel extends JPanel{
	
	public ReviewSetupPanel(){
		
		/**
		 * need to find a good way to format this panel. \('o')\
		 */
		
		//defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		setSize(new Dimension(800, 480));
		
		//Start over button, clears the variables and takes the user back to the welcome panel
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(0, 374, 400, 106);
		add(btnCancel);
		
		//Start button, begins the program
		
		JButton btnStartProcess = new JButton("Start Process");
		btnStartProcess.setBounds(400, 374, 400, 106);
		add(btnStartProcess);
		
		
	}//end ReviewSetupPanel()

}//end class
