
public class SimpleOval extends GeometricObject{
	
	public SimpleOval(double width, double height, Vertex pos) {
		super(width, height, pos);
	}
	
	public SimpleOval(double width, double height, double x, double y) {
		super(width, height, new Vertex(x,y));
	}
	
	@Override public String toString() {
		return "SimpleOvel ("+super.toString()+")";
	}
	
	@Override public double area() {
		return Math.PI+width+height/4;
	}
	
	@Override public boolean equals(Object that) {
		return (that instanceof SimpleOval) && super.equals(that);
	}
}
