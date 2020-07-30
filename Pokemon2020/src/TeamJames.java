import java.util.ArrayList;

public class TeamJames extends PokeTeam{
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Elf());
		team.add(new Rock());
		team.add(new Iceman());
		return team; 
	}
	public TeamJames() {
		super("TeamJames", createTeam());
	}
}
