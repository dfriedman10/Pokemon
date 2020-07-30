//Sharif
//Helo: Sanad, Mr.David
import java.util.ArrayList;

public class TeamSharif extends PokeTeam {
	
	public TeamSharif() {
		super("Sherrif", createTeam());
		for (Pokemon p : createTeam()) 
			System.out.println(p.score());
		
	}

	public static ArrayList<Pokemon> createTeam(){
		
		ArrayList<Pokemon> TeamSharif = new ArrayList<Pokemon>();
		
		TeamSharif.add(new charmander());
		TeamSharif.add(new bulbasaur());
		TeamSharif.add(new squirtle());
		
		return TeamSharif;
	}
	
	
}
