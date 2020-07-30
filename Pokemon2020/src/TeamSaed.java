import java.util.ArrayList;
import java.util.Arrays;

public class TeamSaed extends PokeTeam {

	public TeamSaed() {
		super("The inevitables",
				new ArrayList<Pokemon>(Arrays.asList(new Thanos(), new BigChungus(), new GreekFreak())));

	}

	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Thanos());
		team.add(new BigChungus());
		team.add(new GreekFreak());
		return team;
	}
}
