import java.util.ArrayList;

public class TeamFaris extends PokeTeam {
	
	public TeamFaris() {
		super("TeamFaris", createTeam());
	}

	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Doomer());
		team.add(new virgin());
		team.add(new chad());
		return team;
	}
	
}
