
public class TestVertex {

	public static void main(String[] args) {

		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(3, 23);
		Vertex v3 = v1.skalarMult(42.5);
		
		System.out.println(v2.lenght());			//Abstand zum Ursprung (0,0)
		
		System.out.println(v3);
		
		v1.addMod(v2);								//v2 wird auf v1 addiert
		System.out.println(v1);

		
	}

}
