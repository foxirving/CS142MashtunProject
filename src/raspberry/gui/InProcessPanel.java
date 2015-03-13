package raspberry.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/*
 * This panel shows all the information on what the current step, temp, ad time
 */

public class InProcessPanel extends JPanel{
	
	private JTextField txtTimeLeft;
	private JTextField txtdisplaysTimeLeft;
	private JTextField txtStep;
	private JTextField txtDsiplayStep;
	private JTextField txtCurrentTemp;
	private JTextField txtDsiplayCurrentTemp;
	
	/*
	 * In this class im testing out potential designs for some of my other classes
	 * 
	 * Right now I'm testing out a new GUi design for my 'setupPanel' class.
	 */
	
	public InProcessPanel(){
		
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(800, 480));
		setLayout(null);
		
		JLayeredPane layeredPaneTime = new JLayeredPane();
		layeredPaneTime.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPaneTime.setBackground(Color.BLACK);
		layeredPaneTime.setBounds(0, 0, 800, 240);
		add(layeredPaneTime);
		
		txtTimeLeft = new JTextField();
		txtTimeLeft.setText("Time left;");
		txtTimeLeft.setBounds(24, 11, 224, 51);
		layeredPaneTime.add(txtTimeLeft);
		txtTimeLeft.setColumns(10);
		
		txtdisplaysTimeLeft = new JTextField();
		txtdisplaysTimeLeft.setText("*displays time left*");
		txtdisplaysTimeLeft.setBounds(103, 65, 535, 136);
		layeredPaneTime.add(txtdisplaysTimeLeft);
		txtdisplaysTimeLeft.setColumns(10);
		
		JLayeredPane layeredPaneStepNumb = new JLayeredPane();
		layeredPaneStepNumb.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPaneStepNumb.setBounds(0, 240, 400, 240);
		add(layeredPaneStepNumb);
		
		txtStep = new JTextField();
		txtStep.setBounds(30, 22, 154, 50);
		layeredPaneStepNumb.add(txtStep);
		txtStep.setText("step #");
		txtStep.setColumns(10);
		
		txtDsiplayStep = new JTextField();
		txtDsiplayStep.setText("Dsiplay step #");
		txtDsiplayStep.setBounds(93, 83, 213, 115);
		layeredPaneStepNumb.add(txtDsiplayStep);
		txtDsiplayStep.setColumns(10);
		
		JLayeredPane layeredPaneTemp = new JLayeredPane();
		layeredPaneTemp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPaneTemp.setBounds(400, 240, 400, 240);
		add(layeredPaneTemp);
		
		txtCurrentTemp = new JTextField();
		txtCurrentTemp.setText("Current temp");
		txtCurrentTemp.setBounds(10, 11, 206, 70);
		layeredPaneTemp.add(txtCurrentTemp);
		txtCurrentTemp.setColumns(10);
		
		txtDsiplayCurrentTemp = new JTextField();
		txtDsiplayCurrentTemp.setText("Dsiplay current temp");
		txtDsiplayCurrentTemp.setColumns(10);
		txtDsiplayCurrentTemp.setBounds(114, 83, 213, 115);
		layeredPaneTemp.add(txtDsiplayCurrentTemp);

		
	}//end InProcessPanel()

}//end class
