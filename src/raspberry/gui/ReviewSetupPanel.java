package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * This panel is shown after the 'setup' panel,
 * it shows the user what information that was input into the program
 */

public class ReviewSetupPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel panel_1 = new JPanel();
	private JTextField txtReview;

	public ReviewSetupPanel(){
		
		/**
		 * need to find a good way to format this panel. \('o')\
		 */
		
		//defines what size the panel is
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		setSize(new Dimension(800, 480));
		setBackground(new Color(210, 180, 140));
		
		//Start over button, clears the variables and takes the user back to the welcome panel
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		btnCancel.setForeground(new Color(51, 0, 0));
		btnCancel.setBackground(new Color(153, 51, 51));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnCancel.setBorder(emptyBorder);
		btnCancel.setBounds(0, 375, 400, 105);
		add(btnCancel);
		
		//wrapping
		txtReview = new JTextField();
		txtReview.setForeground(new Color(51, 0, 0));
		txtReview.setHorizontalAlignment(SwingConstants.CENTER);
		txtReview.setText("Review");
		txtReview.setBounds(17, 21, 148, 42);
		add(txtReview);
		txtReview.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 30));
		txtReview.setBorder(emptyBorder);
		txtReview.setColumns(10);
		txtReview.setBackground(new Color(255, 228, 196));
		panel_1.setBackground(new Color(102, 0, 0));
		panel_1.setBounds(10, 11, 155, 52);
		txtReview.setBorder(emptyBorder);
		add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 780, 350);
		panel.setBackground(new Color(255, 248, 220));
		panel.setBorder(emptyBorder);
		add(panel);
		
		//Start button located in the MainGUI
		
		
	}//end ReviewSetupPanel()
}//end class
