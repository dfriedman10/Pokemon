/*
 * Khaled AlBayaydah
 */
public class Farmer extends Pokemon {
	public Farmer() {
		//super method to use the parent function
		super("Farmer", 1, 75, "Farmer.png", new Move[] { new Move("Boom", 1, 30, 2), new Move("Baam", 1, 50, 0),
				new Move("Barabomboom", 1, 50, 0), new Move("Wicked scream", 0, 30, 3) });
	}
}
