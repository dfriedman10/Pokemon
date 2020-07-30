import java.util.ArrayList;

public class teamTalal extends PokeTeam {

	public teamTalal() {
		super("GOT", createTeam());
	}
	
	
	public static ArrayList<Pokemon> createTeam() {
		ArrayList <Pokemon> team = new ArrayList <Pokemon> ();
		team.add(new pokemon1T ());
		team.add(new pokemon2T ());
		team.add(new pokemon3T ());
		return team;
	
		
	}
}
	
	
	