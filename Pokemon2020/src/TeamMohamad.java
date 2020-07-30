import java.util.ArrayList;

public class TeamMohamad extends PokeTeam{
public TeamMohamad() {
	super("Mohamad", createTeam());
}

public static ArrayList<Pokemon> createTeam(){
	ArrayList<Pokemon> TeamMohamad = new ArrayList<Pokemon>();
	TeamMohamad.add(new Lingard());
	TeamMohamad.add(new Jones());
	TeamMohamad.add(new Mustafi());
	
	return TeamMohamad;
}
}
