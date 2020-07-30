//Ismael
import java.util.ArrayList;

public class TeamIsmael extends PokeTeam {
	public TeamIsmael() {
		super("Ismael", createTeam() );
		// TODO Auto-generated constructor stub
	}
	 public static ArrayList<Pokemon> createTeam(){
		 ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Loli());
		 team.add(new Ricardo());
		 team.add(new BlackSquidward());
		 return team;
	 }

}