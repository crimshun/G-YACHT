package projects;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class project26Bulgaria{

	public static void main(String[] args) {
		JFrame f = new JFrame ();
		f.setTitle("Bulgaria");
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		JPanel p1 = new JPanel(); p1.setBackground(Color.white);
		JPanel p2 = new JPanel(); p2.setBackground(Color.green);
		JPanel p3 = new JPanel(); p3.setBackground(Color.red);
	
		
		Container p = f.getContentPane();
		p.setLayout(new GridLayout (3,1));
		
		


		
		p.add(p1); p.add(p2);
		
		p.add(p3);
		
	
		
		f.setVisible(true);

	}

}