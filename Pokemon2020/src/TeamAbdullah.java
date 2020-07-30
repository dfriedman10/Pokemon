import java.util.ArrayList;

public class TeamAbdullah extends PokeTeam {

	
	public  TeamAbdullah() {
		super("TeamAbuAli", createTeam());
	
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> TeamAbuAli = new ArrayList<Pokemon>();
		TeamAbuAli.add(new Avatar());
		TeamAbuAli.add(new Pikatchu());
		TeamAbuAli.add(new ball1());
		return TeamAbuAli;
	}
	
}
