
public class Main {

	public static void main(String[] args) {

		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 23);
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);
		
		GeometricObject o1 = new GeometricObject(2,4,v2);
		GeometricObject o2 = new GeometricObject(2,4,v4);
		System.out.println(o1.equals(o2));
		
		/*System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.isLargerThan(o2));
		
		System.out.println(v1.length());
		System.out.println(v2.length());
		System.out.println(v3.length());
		System.out.println(v1.skalarMult(0.8));

		System.out.println(v2.equals(v4));
		System.out.println(v1.equals(v2));
		
		System.out.println(v1.distance(v2));*/
		
	}

}
