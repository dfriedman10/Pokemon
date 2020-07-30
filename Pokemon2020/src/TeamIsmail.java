import java.util.ArrayList;

public class TeamIsmail extends PokeTeam {
	public TeamIsmail() {
		super("Ismail", createTeam() );
		// TODO Auto-generated constructor stub
	}
	 public static ArrayList<Pokemon> createTeam(){
		 ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new Amygdala());
		 team.add(new LivingFailures());
		 team.add(new OrphanofKos());
		 return team;
	 }

}
