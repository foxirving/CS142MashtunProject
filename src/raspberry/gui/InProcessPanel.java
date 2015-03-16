package raspberry.gui;


import gnu.io.SerialPort;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

/*
 * This panel shows all the information on what the current step, temp, ad time
 */

public class InProcessPanel extends JPanel {



	// Singleton
	private RxTxComm serial = RxTxComm.getInstance();


	// Time left variable
	private JTextField txtdisplaysTimeLeft;

	// step # variable
	private JTextField txtDsiplayStep;

	// current temperature Variable
	private JTextField txtDsiplayCurrentTemp;

	// Labels and Wrapping
	private JTextField txtStep;
	private JTextField txtTimeLeft;
	private JTextField textTemp;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField textField_1;
	private JTextField textField_2;



	public InProcessPanel() {

		// wrapping
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);
		setBackground(new Color(210, 180, 140));

		JLayeredPane layeredPaneTime = new JLayeredPane();
		layeredPaneTime.setBorder(new MatteBorder(1, 1, 1, 1,
				(Color) new Color(51, 0, 0)));
		layeredPaneTime.setBackground(Color.BLACK);
		layeredPaneTime.setBounds(0, 0, 800, 240);
		add(layeredPaneTime);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/raspberry/gui/barely.png"));
		lblNewLabel.setBounds(0, 0, 1024, 238);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/raspberry/gui/hops.png"));
		lblNewLabel_1.setBounds(0, 0, 1024, 238);
		add(lblNewLabel_1);

		// Label: "TIME LEFT:"
		txtTimeLeft = new JTextField();
		txtTimeLeft.setBounds(7, 10, 148, 42);
		layeredPaneTime.add(txtTimeLeft);
		txtTimeLeft.setText(" Time Left ");
		txtTimeLeft.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 30));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		txtTimeLeft.setBorder(emptyBorder);
		txtTimeLeft.setBackground(new Color(255, 228, 196));
		txtTimeLeft.setColumns(10);

		// wrapping
		txtdisplaysTimeLeft = new JTextField();
		txtdisplaysTimeLeft.setForeground(new Color(51, 0, 0));
		txtdisplaysTimeLeft.setHorizontalAlignment(SwingConstants.CENTER);
		txtdisplaysTimeLeft.setBackground(new Color(255, 228, 196));
		txtdisplaysTimeLeft.setText("00:00:00");
		txtdisplaysTimeLeft.setFont(new Font("DejaVu Serif Condensed",
				Font.BOLD, 90));
		txtdisplaysTimeLeft.setBounds(100, 75, 600, 135);
		txtdisplaysTimeLeft.setBorder(emptyBorder);
		layeredPaneTime.add(txtdisplaysTimeLeft);
		txtdisplaysTimeLeft.setColumns(10);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 51, 0));
		panel_2.setBounds(0, 0, 155, 52);
		layeredPaneTime.add(panel_2);

		panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 51, 0));
		panel_5.setBounds(95, 70, 610, 145);
		layeredPaneTime.add(panel_5);

		JLayeredPane layeredPaneStepNumb = new JLayeredPane();
		layeredPaneStepNumb.setBorder(new MatteBorder(1, 1, 1, 1,
				(Color) new Color(51, 0, 0)));
		layeredPaneStepNumb.setBounds(0, 240, 400, 240);
		add(layeredPaneStepNumb);

		// Label: "STEP #"
		txtStep = new JTextField();
		txtStep.setBounds(7, 10, 148, 42);
		layeredPaneStepNumb.add(txtStep);
		txtStep.setText(" Step # ");
		txtStep.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 30));
		txtStep.setBorder(emptyBorder);
		txtStep.setBackground(new Color(255, 228, 196));
		txtStep.setColumns(10);

		// Step Variable field
		txtDsiplayStep = new JTextField();
		txtDsiplayStep.setForeground(new Color(51, 0, 0));
		txtDsiplayStep.setHorizontalAlignment(SwingConstants.CENTER);
		txtDsiplayStep.setBackground(new Color(255, 228, 196));
		txtDsiplayStep.setText("1");
		txtDsiplayStep.setBounds(100, 75, 200, 120);
		txtDsiplayStep
		.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 90));
		txtDsiplayStep.setBorder(emptyBorder);
		layeredPaneStepNumb.add(txtDsiplayStep);
		txtDsiplayStep.setColumns(10);

		// wrapping
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 51, 0));
		panel_3.setBounds(0, 0, 155, 52);
		layeredPaneStepNumb.add(panel_3);

		textField_1 = new JTextField();
		textField_1.setText("Dsiplay step #");
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(153, 51, 0));
		textField_1.setBounds(95, 70, 210, 130);
		textField_1.setBorder(emptyBorder);
		layeredPaneStepNumb.add(textField_1);

		JLayeredPane layeredPaneTemp = new JLayeredPane();
		layeredPaneTemp.setBorder(new MatteBorder(1, 1, 1, 1,
				(Color) new Color(51, 0, 0)));
		layeredPaneTemp.setBounds(400, 240, 400, 240);
		add(layeredPaneTemp);

		final JTextField txtDsiplayTemp = new JTextField();
		txtDsiplayTemp.setText(" Temp.");
		txtDsiplayTemp.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN,
				30));
		txtDsiplayTemp.setColumns(10);
		txtDsiplayTemp.setBackground(new Color(255, 228, 196));
		txtDsiplayTemp.setBorder(emptyBorder);

		// Label: "Temp."
		textTemp = new JTextField();
		textTemp.setEditable(false);
		textTemp.setText("Temp.");
		textTemp.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 30));
		textTemp.setColumns(10);
		textTemp.setBackground(new Color(255, 228, 196));
		textTemp.setBorder(emptyBorder);
		textTemp.setBounds(7, 10, 148, 42);
		layeredPaneTemp.add(textTemp);

		// Tempurature variable field
		txtDsiplayCurrentTemp = new JTextField();
		txtDsiplayCurrentTemp.setForeground(new Color(51, 0, 0));
		txtDsiplayCurrentTemp.setHorizontalAlignment(SwingConstants.CENTER);
		txtDsiplayCurrentTemp.setBackground(new Color(255, 228, 196));
		txtDsiplayCurrentTemp.setFont(new Font("DejaVu Serif Condensed",
				Font.BOLD, 90));
		//txtDsiplayCurrentTemp.setText("100");
		txtDsiplayCurrentTemp.setColumns(10);
		txtDsiplayCurrentTemp.setBorder(emptyBorder);
		txtDsiplayCurrentTemp.setBounds(100, 75, 200, 120);
		layeredPaneTemp.add(txtDsiplayCurrentTemp);

		// wrapping
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 51, 0));
		panel_4.setBounds(0, 0, 155, 52);
		layeredPaneTemp.add(panel_4);

		// Label: "Display step #"
		textField_2 = new JTextField();
		textField_2.setText("Display step #");
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(153, 51, 0));
		textField_2.setBounds(95, 70, 210, 130);
		textField_2.setBorder(emptyBorder);
		layeredPaneTemp.add(textField_2);

		// wrapping
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 0));
		panel_1.setBounds(0, 0, 822, 240);
		add(panel_1);




	}// end InProcessPanel()
	private TempHist getItem() {

		// TODO Auto-generated method stub
		return null;
	}
	// update the temperatures on event
	ActionListener actListner = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {


			TempSample nullTest = serial.getTemp().getLatest();
			
			if (nullTest != null) {
				txtDsiplayCurrentTemp.setText(nullTest.getTempF());
			}



		}
	};
	Timer timer = new Timer(2000, actListner); {
		timer.start();
	}




}// end class
