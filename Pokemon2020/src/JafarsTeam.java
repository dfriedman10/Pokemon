import java.util.ArrayList;

public class JafarsTeam extends PokeTeam {
	
	public JafarsTeam() {
		super("Jafexis", createTeam());
		for (Pokemon p : createTeam()) 
			System.out.println(p.score());
		
	}

	public static ArrayList<Pokemon> createTeam(){
		
		ArrayList<Pokemon> JafarsTeam = new ArrayList<Pokemon>();
		
		JafarsTeam.add(new Batman());
		JafarsTeam.add(new Trump());
		JafarsTeam.add(new Blastoise());
		
		return JafarsTeam;
	}
	
	
}