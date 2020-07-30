public class Charizard extends Pokemon {
	
	public Charizard() {
		super("Charizard", 1, 75, "Charizard.png", new Move[] {new Move("Bite",0,20,0),
															   new Move("Flamethrower",1,20,1),
															   new Move("Hydro Pump",2,20,2),
															   new Move("Solar Beam",3,20,3)});
	}

}
