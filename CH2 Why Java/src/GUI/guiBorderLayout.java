package GUI;

import javax.swing.*;
import java.awt.*;

public class guiBorderLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Layout");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel north = new JPanel();north.setBackground(Color.red);
		JPanel east = new JPanel();east.setBackground(Color.blue);
		JPanel south = new JPanel();south.setBackground(Color.red);
		JPanel west = new JPanel();west.setBackground(Color.blue);
		
		
		Container p = frame.getContentPane();
		p.add(north, BorderLayout.NORTH);
		p.add(east, BorderLayout.EAST);
		p.add(south, BorderLayout.SOUTH);
		p.add(west, BorderLayout.WEST);
		
		frame.setVisible(true);
		
	}

}
