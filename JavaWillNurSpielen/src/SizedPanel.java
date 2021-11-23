import javax.swing.*;
import java.awt.Dimension;


public class SizedPanel extends JPanel{

	int preferredheight = 400;
	int preferredwidth = 300;
	
	public SizedPanel(int w, int h) {
		preferredheight = h;
		preferredwidth = w;
	}
	
	public SizedPanel() {}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(preferredwidth,preferredheight);
	}
	
}
