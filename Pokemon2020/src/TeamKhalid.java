import java.util.ArrayList;

public class TeamKhalid extends PokeTeam {

	
	public TeamKhalid() {
		super("TeamKhalid", createTeam());
	}
	
	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> Team = new ArrayList<Pokemon>();
		Team.add(new Hitmonchan());
		Team.add(new Lucario());
		Team.add(new Snorlax());
		return Team;
	}

}
