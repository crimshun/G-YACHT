package GUI;


import javax.swing.*;
import java.awt.*;


public class guiGridLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame ();
		f.setTitle("GridLayout");
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame Milton = new JFrame();
		Milton.setTitle("Good Morning!");
		Milton.setSize(500,800);
		
		
		
		
		JPanel p1 = new JPanel(); p1.setBackground(Color.white);
		JPanel p2 = new JPanel(); p2.setBackground(Color.black);
		JPanel p3 = new JPanel(); p3.setBackground(Color.gray);
		JPanel p4 = new JPanel(); p4.setBackground(Color.blue);
		JPanel MiltonP = new JPanel(); MiltonP.setBackground(Color.red);
		
		Container p = f.getContentPane();
		p.setLayout(new GridLayout (1,4));
		
		Container c = Milton.getContentPane();



		
		p.add(p1); p.add(p2);
		
		p.add(p3); p.add(p4);
		
		c.add(MiltonP);
		
		f.setVisible(true);
		Milton.setVisible(true);
	}

}
