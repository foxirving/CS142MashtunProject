package raspberry.gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainGUI extends WelcomePanel{

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);

					/**
					 * This is where we add the new Panel classes.
					 * I added all the necessary info to open each panel: to open, just
					 * comment out all but one of the panels bellow. \(='v'=}/
					 * 
					 * Panel Order: 
					 * 1- WelcomePanel() 
					 * 2- AboutPanel() 
					 * 3-SetupPanel() 
					 * 4- ReviewSetupPanel() 
					 * -optional WarmWaterPanel()- 
					 * 5- InProcessPanel() 
					 * 6- FinishedPanel()
					 */

					
					// This opens the welcome panel
					// window.frame.getContentPane().add(new WelcomePanel());
					WelcomePanel welcomePanel = new WelcomePanel();
				

					// This opens the about panel
					// window.frame.getContentPane().add(new AboutPanel());

					// This opens the setup panel
					// window.frame.getContentPane().add(new SetupPanel());

					// This opens the Review Setup panel
					// window.frame.getContentPane().add(new ReviewSetupPanel());

					// This opens the In Process panel
					// window.frame.getContentPane().add(new InProcessPanel());

					// This opens the finished panel
					// window.frame.getContentPane().add(new FinishedPanel());

					// Opens the testPanaelformat class
					// I use this class to test out any designs I'm considering changing
					// window.frame.getContentPane().add(new TestPanelFormat());

					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// end main

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(800, 480, 800, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		
	}


}
