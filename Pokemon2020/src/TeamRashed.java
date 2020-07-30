import java.util.ArrayList;
import java.util.Arrays;

public class TeamRashed extends PokeTeam {

	public TeamRashed() {
		super("The All-Stars", new ArrayList<Pokemon>(Arrays.asList(new Lebron2(), new BeetleJuice(), new Obama())));

	}

	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Lebron2());
		team.add(new BeetleJuice());
		team.add(new Obama());
		return team;
	}
}