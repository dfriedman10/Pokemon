import java.util.ArrayList;

public class TeamRaouf extends PokeTeam {
	
	public TeamRaouf() {
		super ("Team Raouf", createTeam());
	}
	
	public static ArrayList <Pokemon> createTeam () {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new BlastoiseRaouf());
		team.add(new Charizard());
		team.add(new Muk());
		
		
		return team;
	}
}
