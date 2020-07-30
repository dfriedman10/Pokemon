import java.util.ArrayList;

public class TeamSeokhyeon extends PokeTeam {

	public TeamSeokhyeon() {
		super("Seokhyeon", createTeam());
	}

	private static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> myTeam = new ArrayList<Pokemon>();
		myTeam.add(new Podori());
		myTeam.add(new dolphin());
		myTeam.add(new police());
		return myTeam;
	}

}
