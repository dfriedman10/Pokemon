import java.util.ArrayList;

public class TeamRui extends PokeTeam{
	
	public TeamRui() {
		super("Rui", createTeam());
	}
	
	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> myTeam = new ArrayList<Pokemon>();
		myTeam.add(new Pikachu2());
		myTeam.add(new Charmeleon());
		myTeam.add(new Feras());
		return myTeam;
	}

}
