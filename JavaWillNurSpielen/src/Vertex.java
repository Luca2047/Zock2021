
public class Vertex {
	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + " , " + y + ")";
	}

	public double length() { // Abstand zum Ursprung (0,0)
		return Math.sqrt(x * x + y * y);
	}

	public double distance(Vertex v2) { // Abstand von Vektor v1 zu Vektor v2
		double xx = v2.x - this.x;
		double yy = v2.x - this.y;
		return Math.sqrt(xx * xx + yy * yy);
	}
	
	public void normalize() {	// Bringt den Betrag eines Vertex auf 1
		double factor = this.length();
		this.x = x / factor;
		this.y = y / factor;
		
	}

	public Vertex skalarMult(double s) { // Skalliert einen Vertex um s und erstellt einen neuen Vektor
		return new Vertex(x * s, y * s);
	}

	public void skalarMultMod(double s) { // Skalliert einen Vertex um s
		x = x * s;
		y = y * s;
	}

	public Vertex add(Vertex v2) { // Addiert x und y von v2 auf den Vertex und erstellt einen neuen Vertex
		return new Vertex(x + v2.x, y + v2.y);
	}

	public void addMod(Vertex v2) { // Addiert x und y von v2 auf den Vertex
		x = x + v2.x;
		y = y + v2.y;
	}

	public Vertex sub(Vertex v2) {
		return new Vertex(x - v2.x, y - v2.y);
	}

	public void subMod(Vertex v2) {
		x = x - v2.x;
		y = y - v2.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y == that.y;
		}
		return false;
	}

}
