package projects;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class project27 {

	public static void main(String[] args) {
		JFrame f = new JFrame ();
		f.setTitle("proj27");
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		JPanel p1 = new JPanel(); p1.setBackground(Color.black);
		JPanel p2 = new JPanel(); p2.setBackground(Color.white);
		JPanel p3 = new JPanel(); p3.setBackground(Color.black);
		JPanel p4 = new JPanel(); p4.setBackground(Color.white);
		JPanel p5 = new JPanel(); p5.setBackground(Color.black);
		JPanel p6 = new JPanel(); p6.setBackground(Color.white);
		JPanel p7 = new JPanel(); p7.setBackground(Color.black);
		JPanel p8 = new JPanel(); p8.setBackground(Color.white);
		JPanel p9 = new JPanel(); p9.setBackground(Color.black);
	
		
		Container p = f.getContentPane();
		p.setLayout(new GridLayout (3,3));
		
		


		
		p.add(p1); p.add(p2);
		
		p.add(p3); p.add(p4); 
		
		p.add(p5); p.add(p6);
        
		p.add(p7); p.add(p8);
		
		p.add(p9);
		
	
		
		f.setVisible(true);

	}

}
