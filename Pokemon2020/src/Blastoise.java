
public class Blastoise extends Pokemon {

	public Blastoise() {
		super("Blast", 3, 100, "Blastoise.jpg"
				+ "", new Move [] { new Move ("HydroPump", 2, 20, 0), 
				new Move ("HydroFlash", 3, 40, 3), 
				new Move ("HydroKill", 0, 30, 1), 
				new Move ("HydroSmash", 1, 10, 2)});
	}

}
