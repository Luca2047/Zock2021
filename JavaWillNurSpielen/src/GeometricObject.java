
public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;

	public GeometricObject(double width, double height, Vertex pos) {

		this.width = width;
		this.height = height;
		this.pos = pos;
		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}

		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}

	}

	public GeometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0));
	}

	public GeometricObject(double w) {
		this(w, w);
	}

	public GeometricObject() {
		this(10);
	}

	public String toString() {
		return "width = " + width + " height = " + height + " pos = " + pos;
	}

	public double circumference() {
		return 2 * (width + height);
	}

	public double area() {
		return height * width;
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

	public boolean isLargerThan(GeometricObject that) {
		return this.area() > that.area();
	}

	public void moveTo(Vertex pos) {
		this.pos = pos;
	}

	public void moveToVertex(double x, double y) {
		moveTo(new Vertex(x, y));
	}

	public void move(Vertex v) {
		moveTo(pos.add(v));
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof GeometricObject) {
			GeometricObject that = (GeometricObject) thatObject;
			return that.width == this.width && that.height == this.height && that.pos.equals(this.pos);
		}
		return false;
	}

}
