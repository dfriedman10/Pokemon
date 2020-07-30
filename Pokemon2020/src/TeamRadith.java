import java.util.ArrayList;

public class TeamRadith extends PokeTeam {

	public TeamRadith() {
		super("TeamRadith", createTeam());
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> myTeam = new ArrayList<Pokemon>();
		myTeam.add(new Spongebob());
		myTeam.add(new Patrick());
		myTeam.add(new Squidward());
		
		return myTeam;
		
	}

}
