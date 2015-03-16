package raspberry.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PresentationGUI extends JPanel{

	private JFrame frame;
	private JTextField textDisplayFahrenheit;
	private JTextField txtDegreesInF;
	private JTextField textDisplayCelsius;
	private JTextField textField_1;
	private JTextField txtDegreesInCelsius;
	private JTextField txtTargetTemperature;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PresentationGUI window = new PresentationGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PresentationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//wrapping
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 480);
		//frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//wrapping
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 480);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(210, 180, 140));
		panel.setLayout(null);
		
		//Displays the Temp F variable
		textDisplayFahrenheit = new JTextField();
		textDisplayFahrenheit.setText("145");
		textDisplayFahrenheit.setBounds(74, 36, 213, 65);
		panel.add(textDisplayFahrenheit);
		textDisplayFahrenheit.setColumns(10);
		
		//Label
		txtDegreesInF = new JTextField();
		txtDegreesInF.setText("Degrees in Farenheit");
		txtDegreesInF.setBounds(307, 35, 138, 45);
		panel.add(txtDegreesInF);
		txtDegreesInF.setColumns(10);
		
		//Displays the Temp C variable
		textDisplayCelsius = new JTextField();
		textDisplayCelsius.setText("35");
		textDisplayCelsius.setColumns(10);
		textDisplayCelsius.setBounds(74, 143, 213, 65);
		panel.add(textDisplayCelsius);
		
		//Displays the desired temp variable
		textField_1 = new JTextField();
		textField_1.setText("190");
		textField_1.setColumns(10);
		textField_1.setBounds(74, 238, 213, 65);
		panel.add(textField_1);
		
		//label
		txtDegreesInCelsius = new JTextField();
		txtDegreesInCelsius.setText("Degrees in Celsius");
		txtDegreesInCelsius.setColumns(10);
		txtDegreesInCelsius.setBounds(307, 144, 138, 45);
		panel.add(txtDegreesInCelsius);
		
		//label
		txtTargetTemperature = new JTextField();
		txtTargetTemperature.setText("Target Temperature");
		txtTargetTemperature.setColumns(10);
		txtTargetTemperature.setBounds(307, 238, 138, 45);
		panel.add(txtTargetTemperature);
	}
}
