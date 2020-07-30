import java.util.ArrayList;

public abstract class PokeTeam {

	private ArrayList<Pokemon> team;
	private String name;
	public static final int SCORELIMIT = 1050;
	
	public PokeTeam(String name, ArrayList<Pokemon> team) {
		this.team = team; this.name = name;
	}
	
	public String getName() {return name;}
	public ArrayList<Pokemon> getTeam() {return team;}
	
	public boolean isAlive() {return !team.isEmpty();}
	
	public boolean isLegal() { 
		int score = 0; 
		for (Pokemon p : team) {
			score += p.score();
			if (p.moves.length != 4 || p.getClass().getDeclaredMethods().length!=0)
				return false;
		}
		return score <= SCORELIMIT && team.size() == 3;
		
	}
}
