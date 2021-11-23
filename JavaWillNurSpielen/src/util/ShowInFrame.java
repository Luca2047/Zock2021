package util;

import javax.swing.*;


public class ShowInFrame {
	
	public static void show(String title, JComponent c) {
		
		JFrame f1 = new JFrame(title);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.add(c);
		f1.pack();
		f1.setVisible(true);
		
	}
	
public static void show(JComponent c) {
		
		show("",c);
		
	}
	
}
