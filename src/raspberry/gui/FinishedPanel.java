package raspberry.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 * This panels shows after the 'in process' panel is complete
 */

public class FinishedPanel extends JPanel{
	
	//creates a new text field
	
	private JTextField txtFinishedWoo;
	
	public FinishedPanel() {
		
		// defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);
		
		//Text field telling the user the program is finished
		
		txtFinishedWoo = new JTextField();
		txtFinishedWoo.setBounds(252, 84, 333, 144);
		txtFinishedWoo.setText("FINISHED! woo");
		add(txtFinishedWoo);
		txtFinishedWoo.setColumns(10);
		
		
		// done button, this button will put the user back at the welcome panel
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(200, 363, 400, 106);
		add(btnDone);
		

	}//end FinishedPanel()
}//end class
