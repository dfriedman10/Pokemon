import java.util.ArrayList;

public class TeamOdai extends PokeTeam{

	public TeamOdai() {
		super("Team Odai",odai());

	}
	
	public static ArrayList<Pokemon> odai(){
		ArrayList<Pokemon> ot = new ArrayList<Pokemon>();
		
		ot.add(new pokemon1O());
		ot.add(new pokemon2O());
		ot.add(new pokemon3O());
		
		return ot;
	}

}
