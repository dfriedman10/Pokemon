
import java.util.ArrayList;

public class TeamOmar extends PokeTeam {

	public TeamOmar() {
		super("superstars", createTeam());
	}
	
	public static ArrayList<Pokemon> createTeam() {
		ArrayList <Pokemon> team = new ArrayList <Pokemon> ();
		team.add(new Pokemon1 ());
		team.add(new Pokemon2 ());
		team.add(new Pokemon3 ());
		return team;
	}
}
	
	
	
		

	
	
	
	