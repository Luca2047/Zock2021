
public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;

	public GeometricObject(double width, double height, Vertex pos) {
		this.width = width;
		this.height = height;
		this.pos = pos;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}

}
