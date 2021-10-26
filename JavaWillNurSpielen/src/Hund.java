
public class Hund {

	String name = null;
	String rasse = null;
	int alter;
	double sLautstaerkeDB;

	public Hund(String name, int alter, double sLautstaerkeDB) {

		this.name = name;
		this.alter = alter;
		this.sLautstaerkeDB = sLautstaerkeDB;

	}

	public Hund(String name, int alter) {

		this(name, alter, 1);

	}

	public Hund(String name) {

		this(name, 0);

	}

	public Hund() {

		this("Hund");

	}

	public double getLautstaerkeDB() {

		return sLautstaerkeDB;
	}
}
