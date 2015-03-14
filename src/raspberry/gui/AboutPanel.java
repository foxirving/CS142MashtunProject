package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.SwingConstants;

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
		txtAboutTheProgram.setHorizontalAlignment(SwingConstants.CENTER);
		txtAboutTheProgram.setText("About the program");
		txtAboutTheProgram.setBounds(175, 11, 450, 290);
		txtAboutTheProgram.setBackground(new Color(255, 248, 220));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		txtAboutTheProgram.setBorder(emptyBorder);
		add(txtAboutTheProgram);
		txtAboutTheProgram.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBounds(750, 0, 50, 480);
		add(panel_4);
		panel_4.setBackground(new Color(51, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(51, 0, 0));
		panel_3.setBounds(0, 0, 50, 480);
		add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 0, 0));
		panel_1.setBorder(null);
		panel_1.setBounds(0, 0, 100, 480);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(102, 0, 0));
		panel_2.setBounds(700, 0, 100, 480);
		add(panel_2);
		
		//okay button located in the MainGUI

	}// end aboutPanel()

}// end class

