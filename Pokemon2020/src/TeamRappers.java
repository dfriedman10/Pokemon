import java.util.ArrayList;

public class TeamRappers  extends PokeTeam{
	
	public TeamRappers() {
		super("TeamRappers", createTeam());
		
	}
	
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new uzi());
		team.add(new travis());
		team.add(new Tyler());
		return team;
	}

}
