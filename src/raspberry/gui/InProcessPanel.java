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
	
	public InProcessPanel(){
		
	setSize(new Dimension(800, 480));
	setLayout(null);
	
	//Layer Pane for the time
	
	JLayeredPane layeredPaneTime = new JLayeredPane();
	layeredPaneTime.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	layeredPaneTime.setBackground(Color.BLACK);
	layeredPaneTime.setBounds(0, 0, 800, 240);
	add(layeredPaneTime);
	
	//Layer Pane for the number
	
	JLayeredPane layeredPaneStepNumb = new JLayeredPane();
	layeredPaneStepNumb.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	layeredPaneStepNumb.setBounds(0, 240, 400, 240);
	add(layeredPaneStepNumb);
	
	//Layer Pane for the temperature
	
	JLayeredPane layeredPaneTemp = new JLayeredPane();
	layeredPaneTemp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	layeredPaneTemp.setBounds(400, 240, 400, 240);
	add(layeredPaneTemp);
	
	


	}//end InProcessPanel()

}//end class
