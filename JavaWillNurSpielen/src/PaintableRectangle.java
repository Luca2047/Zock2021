import java.awt.Graphics;

public class PaintableRectangle extends SimpleRectangle implements Paintable{

	public PaintableRectangle(double width, double height, double x, double y) {
		super(width,height,x,y);
	}

	@Override
	public void paintTo(Graphics g) {
		g.fillRect((int)width, (int)height, (int)pos.x, (int)pos.y);
		
	}
	
}
