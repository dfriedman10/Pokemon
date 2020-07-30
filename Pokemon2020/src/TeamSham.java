import java.util.ArrayList;

//sham
public class TeamSham extends PokeTeam{

	public TeamSham() {
		super("Team Sham", newTeam());
	}
	public static ArrayList<Pokemon> newTeam(){
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Thing1());
		team.add(new Thing2());
		team.add(new Thing3());
		return team;
	}
	
}
