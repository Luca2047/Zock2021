import java.awt.Color;

import javax.swing.*;
import util.ShowInFrame;

public class SimpleSizedPanel extends SizedPanel{
	
	@Override
	public void paintComponent(java.awt.Graphics g) {
		g.setColor(Color.black);
		g.fillRect(30, 50, 45, 80);

	}
	
	

}