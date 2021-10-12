
public class SimpleSquare extends GeometricObject{
	
	public SimpleSquare(double width, Vertex pos) {
		super(width, pos);
	}

	public SimpleSquare(double width, double x, double y) {
		super(width, new Vertex(x, y));
	}

	@Override
	public String toString() {
		return "SimpleSquare (" + super.toString() + ")";
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public boolean equals(Object that) {
		return (that instanceof SimpleSquare) && super.equals(that);
	}
	
}
