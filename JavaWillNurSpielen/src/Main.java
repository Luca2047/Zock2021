
public class Main {

	public static void main(String[] args) {

		GeometricObject o1 = new GeometricObject(17, 4, new Vertex(12, 5));
		GeometricObject o2 = new GeometricObject(17, 4);
		GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();
		
		Vertex v1 = new Vertex(4,4);
		System.out.println(o2.contains(v1));

		/*System.out.println(o1.equals(o2));
		o2.moveTo(42, 23);
		System.out.println(o1.equals(o2));*/
	}

}
