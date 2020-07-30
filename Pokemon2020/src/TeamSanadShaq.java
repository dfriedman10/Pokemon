// sanad shaqman
import java.util.ArrayList;

public class TeamSanadShaq extends PokeTeam {

	public TeamSanadShaq() {
		super("Team Sanad", teamSondos());
	}

	public static ArrayList<Pokemon> teamSondos() {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Messi());
		team.add(new Suarez());
		team.add(new Neymar());
		return team;
	}

}
