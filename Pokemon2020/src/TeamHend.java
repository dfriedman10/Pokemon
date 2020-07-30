import java.util.ArrayList;

public class TeamHend extends PokeTeam{

	public TeamHend() {
		super ("Hend", createTeam());
	}
	
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> listPoke = new ArrayList<Pokemon>();
		
		listPoke.add(new PokemonAA());
		listPoke.add(new PokemonBB());
		listPoke.add(new PokemonC());
		
		return listPoke; 
	}
}
