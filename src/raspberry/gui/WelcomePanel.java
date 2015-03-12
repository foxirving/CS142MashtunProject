package raspberry.gui;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * This is the First panel, it serves as a welcome page when the user boots up the GUI
 */

public class WelcomePanel extends JPanel {

	public WelcomePanel() {

		// defines what size the panel is
		setLayout(null);
		setSize(new Dimension(800, 480));
		
		
	/**
	 * TEMPORARY WELCOME SIGN
	 */
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setText("WELCOME");
		txtpnWelcome.setBounds(310, 153, 180, 66);
		add(txtpnWelcome);

	//start button, moves the program to the next panel
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//NextMethod.nextPanel();
			}
		});
		btnStart.setBounds(325, 320, 150, 50);
		
		add(btnStart);

	

	}// end WelcomePanel()

}// end class
