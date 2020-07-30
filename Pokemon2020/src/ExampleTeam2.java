import java.util.ArrayList;

public class ExampleTeam2 extends PokeTeam {
	
	public ExampleTeam2() {
		super("Team Jacked", createTeam());
	}

	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new JohnCena());
		team.add(new LeBron());
		team.add(new MrDavid());
		return team;
	}
}
