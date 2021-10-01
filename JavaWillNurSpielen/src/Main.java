
public class Main {

	public static void main(String[] args) {

		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 23);
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);

		System.out.println(v2);
		System.out.println(v1.lenght());
		System.out.println(v2.lenght());
		System.out.println(v3.lenght());
		System.out.println(v1.skalarMult(0.8));

		System.out.println(v2.equals(v4));
	}

}
