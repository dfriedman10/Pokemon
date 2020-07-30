import java.util.ArrayList;
//Made by: Iman
//Helped by: Mr. David
public class TeamIman extends PokeTeam{

	public TeamIman() {
		super("teamIman", createTeam());
	}
	
	
	 public static ArrayList<Pokemon> createTeam(){
		 ArrayList <Pokemon >team = new ArrayList <Pokemon>() ;
		 team.add(new Sham());
		 team.add(new Magableh());
		 team.add(new Raouf());
		 
		 return team;
		
	 }

}
