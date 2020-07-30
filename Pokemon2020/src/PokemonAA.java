public class PokemonAA extends Pokemon {

	public PokemonAA() {
		super ("Sponge Bob", 0, 70, "spongeBob.png", new Move[] { 
				
				new Move("Butterfly", 1, 30, 2),
				new Move("flower", 2, 20, 2),
				new Move("ant", 1, 30, 2),
				new Move("worm",1, 20, 2),
		});
	}
	
	public static void main(String[] args) {
		new TeamBattleRunner();
	}
}
