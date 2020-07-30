import java.util.ArrayList;

public class ExampleTeam1 extends PokeTeam {
	
	public ExampleTeam1() {
		super("Team Drugs are Bad",createTeam());
	}

	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Shaggy());
		team.add(new Shrek());
		team.add(new AmericanSoldier());
		return team;
	}
}
