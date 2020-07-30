import java.util.ArrayList;

public class TeamBora extends PokeTeam {

	public TeamBora() {
		super("the coders", createTeam());
	}
	
	
	public static ArrayList<Pokemon> createTeam() {
		ArrayList <Pokemon> team = new ArrayList <Pokemon> ();
		team.add(new myPokemon1 ());
		team.add(new myPokemon2 ());
		team.add(new myPokemon3 ());
		return team;
	
		
	}
	
	
	
	
}
