import java.util.ArrayList;

// Done by Sanad Hajarat

public class TeamSanad extends PokeTeam{

	public TeamSanad() {
		super("Sanad", createTeam());
	}

	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> TeamSanad = new ArrayList<Pokemon>();
		
		TeamSanad.add(new Leprechaun());
		TeamSanad.add(new ShaunTheSheep());
		TeamSanad.add(new Eminem());
		
		return TeamSanad;
	}
	
}
