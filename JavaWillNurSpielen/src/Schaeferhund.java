
public class Schaeferhund extends Hund {


	public Schaeferhund(String name, int alter, double sLautstaerkeDB) {

		super(name, alter, sLautstaerkeDB);
		this.rasse = "Schäferhund";

	}

	public Schaeferhund(String name, int alter) {

		super(name, alter);

	}

	public Schaeferhund(String name) {

		super(name, 0);

	}

	public Schaeferhund() {

		super("Schaeferhund");

	}

	@Override
	public double getLautstaerkeDB() {

		return 1.5 * sLautstaerkeDB;
	}

}
