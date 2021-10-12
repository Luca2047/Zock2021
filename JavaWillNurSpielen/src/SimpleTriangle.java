
public class SimpleTriangle extends GeometricObject {

	public SimpleTriangle(double width, double height, Vertex pos) {
		super(width, height, pos);
	}

	public SimpleTriangle(double width, double height, double x, double y) {
		super(width, height, new Vertex(x, y));
	}

	@Override
	public String toString() {
		return "SimpleTriangle (" + super.toString() + ")";
	}

	@Override
	public double area() {
		return (width * width) / 4 * Math.sqrt(3);
	}

	@Override
	public boolean equals(Object that) {
		return (that instanceof SimpleTriangle) && super.equals(that);
	}
}
