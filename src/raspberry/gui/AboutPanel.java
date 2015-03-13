package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * This is the Second Panel, it tells the user what this program does
 */

public class AboutPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtAboutTheProgram;

	public AboutPanel() {

		// defines what size the panel is
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 480));
		setLayout(null);
		setBackground(new Color(210, 180, 140));

		// text field explaining what the program does
		
		txtAboutTheProgram = new JTextField();
		txtAboutTheProgram.setText("About the program");
		txtAboutTheProgram.setBounds(175, 11, 450, 300);
		add(txtAboutTheProgram);
		txtAboutTheProgram.setColumns(10);
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(153, 51, 0));
//		panel_1.setBounds(10, 50, 780, 233);
//		add(panel_1);

		// okay button, moves the program to the next panel
		
//		JButton btnOkay = new JButton("Okay");
//		btnOkay.setBounds(325, 320, 150, 50);
//		add(btnOkay);

	}// end aboutPanel()

}// end class

