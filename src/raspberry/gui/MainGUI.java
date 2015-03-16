package raspberry.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;

public class MainGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Panel Order: 1- WelcomePanel() 2- AboutPanel() 3-SetupPanel() 4-
	 * ReviewSetupPanel() 5- InProcessPanel() 6- FinishedPanel()
	 */

	// Creates a new panel variable
	private static WelcomePanel welcomePanel;
	private static AboutPanel aboutPanel;
	private static SetupPanel setupPanel;
	private static ReviewSetupPanel reviewSetupPanel;
	private static InProcessPanel inProcessPanel;
	private static FinishedPanel finishedPanel;

	private RxTxComm serial = RxTxComm.getInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//This create the main frame
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// end main

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainGUI() throws IOException {

		initialize();


		/**
		 * Making of each new panel to be placed inside the frame
		 */
		// creates a new welcome panel to be placed in the JFrame
		welcomePanel = new WelcomePanel();

		// creates a new about panel to be placed in the JFrame
		aboutPanel = new AboutPanel();

		// creates a new about panel to be placed in the JFrame
		setupPanel = new SetupPanel();

		// creates a new about panel to be placed in the JFrame
		reviewSetupPanel = new ReviewSetupPanel();

		// creates a new about panel to be placed in the JFrame
		inProcessPanel = new InProcessPanel();

		// creates a new about panel to be placed in the JFrame
		finishedPanel = new FinishedPanel();

		/**
		 * This is where we add the panel to the frame
		 */

		// Places the panel inside the frame
		frame.getContentPane().add(welcomePanel);

		// This button bellow appears on the welcome panel
		// When pressed it moves the user to the aboutPanel
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(new Color(51, 0, 0));
		btnStart.setBackground(new Color(112, 128, 144));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(false);
				frame.getContentPane().add(aboutPanel);
			}
		});
		btnStart.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnStart.setBorder(emptyBorder);
		btnStart.setBounds(200, 310, 400, 105);
		welcomePanel.add(btnStart);

		// This button bellow appears on the about panel
		// When pressed it moves the user to the setup panel


		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(255, 228, 196));
		btnNext.setForeground(new Color(51, 0, 0));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutPanel.setVisible(false);
				frame.getContentPane().add(setupPanel);
			}
		});
		btnNext.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		btnNext.setBorder(emptyBorder);
		btnNext.setBounds(200, 310, 400, 105);
		aboutPanel.add(btnNext);

		/**
		 * Code needed for the setup panel bellow to loop through the panel if the user input more than 1
		 * step
		 */

		// This button appears on the setup panel
		// When pressed it moves the user to the review setup Panel
		JButton btnEnter = new JButton("Enter");
		btnEnter.setForeground(new Color(51, 0, 0));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setupPanel.setVisible(false);
				frame.getContentPane().add(reviewSetupPanel);

				// This is a secret code users can input to close the program
				// String sss = txtArea.getText();
				// if (sss == txtPass) {
				// System.exit(0);
				// }
			}
		});
		btnEnter.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 36));
		btnEnter.setBorder(emptyBorder);
		btnEnter.setBackground(new Color(51, 153, 0));
		btnEnter.setBounds(667, 360, 133, 119);
		setupPanel.add(btnEnter);

		/**
		 * Code needed for the review setup panel to loop through the panel if the user input more than 1
		 * step
		 */
		// This button appears on the review setup panel
		// When pressed it moves the user to the in process Panel
		JButton btnStartProcess = new JButton("Start Process");
		btnStartProcess.setForeground(new Color(51, 0, 0));
		btnStartProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewSetupPanel.setVisible(false);
				frame.getContentPane().add(inProcessPanel);
			}
		});
		btnStartProcess.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		btnStartProcess.setBorder(emptyBorder);
		btnStartProcess.setBackground(new Color(51, 153, 0));
		btnStartProcess.setBounds(400, 375, 400, 105);
		reviewSetupPanel.add(btnStartProcess);

		/**
		 * NO button is needed here to continue the program because it should
		 * stop when the timer runs out
		 * THe button bellow is used to continue the panel. delete when no longer needed
		 */

		// This button appears on the finished panel
		// When pressed it takes the user back to the welcome panel
		//		JButton btnTempButton = new JButton("Temporary Button");
		//		btnTempButton.addActionListener(new ActionListener() {
		//			public void actionPerformed(ActionEvent e) {
		//				inProcessPanel.setVisible(false);
		//				frame.getContentPane().add(finishedPanel);
		//			}
		//		});
		//		btnTempButton.setBounds(400, 374, 400, 106);
		//		inProcessPanel.add(btnTempButton);

		// This button appears on the finished panel
		// When pressed it takes the user back to the welcome panel
		JButton btnDone = new JButton("Done");
		btnDone.setForeground(new Color(51, 0, 0));
		btnDone.setBackground(new Color(255, 228, 196));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedPanel.setVisible(false);

				/**
				 * Having trouble taking the user back to the main welcome panel
				 */
				//finishedPanel.setVisible(true);
				//welcomePanel = new WelcomePanel();
				//frame.getContentPane().add(welcomePanel);
			}
		});
		btnDone.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 47));
		btnDone.setBorder(emptyBorder);
		btnDone.setBounds(200, 310, 400, 105);
		finishedPanel.add(btnDone);

	}// end MainGUI

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
