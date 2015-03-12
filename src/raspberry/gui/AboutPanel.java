package raspberry.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * This is the Second Panel, it tells the user what this program does
 */

public class AboutPanel extends JPanel {
	private JTextField txtAboutTheProgram;

	public AboutPanel() {

		// defines what size the panel is
		setLayout(null);
		setSize(new Dimension(800, 480));

		// text field explaining what the program does
		
		txtAboutTheProgram = new JTextField();
		txtAboutTheProgram.setText("About the program");
		txtAboutTheProgram.setBounds(175, 11, 450, 300);
		add(txtAboutTheProgram);
		txtAboutTheProgram.setColumns(10);

		// okay button, moves the program to the next panel
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setBounds(325, 320, 150, 50);
		add(btnOkay);

	}// end aboutPanel()

}// end class

