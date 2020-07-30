//Sharif Janbek
public class charmander extends Pokemon {

	public charmander() {
		super("Charmander",1,155,"charmander.png",new Move[] {
				new Move("Flamethrower",1,25,0),
				new Move("Scratch",0,15,0),
				new Move("Leer",0,0,3),
				new Move("Bite",1,1,4)
		}
			);	
		
	}
}

