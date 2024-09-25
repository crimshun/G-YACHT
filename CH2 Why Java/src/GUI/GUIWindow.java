package GUI;

import javax.swing.*;
import java.awt.*;

public class GUIWindow {

	public static void main(String[] args) {
		
		JFrame theGUI = new JFrame();
		theGUI.setTitle("First GUI Program");
		theGUI.setSize(300,200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220,20,60));
		
		Container pane = theGUI.getContentPane();
		pane.add(panel);
		
		
		
		
		theGUI.setVisible(true);
		
		
		
	}

}
