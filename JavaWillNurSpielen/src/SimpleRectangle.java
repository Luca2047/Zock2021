
public class SimpleRectangle extends GeometricObject{

	public SimpleRectangle(double width, double height, Vertex pos) {
		super(width, height, pos);
	}

	public SimpleRectangle(double width, double height, double x, double y) {
		super(width, height, new Vertex(x, y));
	}

	@Override
	public String toString() {
		return "SimpleRectangle (" + super.toString() + ")";
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public boolean equals(Object that) {
		return (that instanceof SimpleRectangle) && super.equals(that);
	}
}
