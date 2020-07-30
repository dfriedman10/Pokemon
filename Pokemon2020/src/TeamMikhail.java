import java.util.ArrayList;

//Mikhail

public class TeamMikhail extends PokeTeam{
	
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(new FireAlarm());
		team.add(new LockDown());
		team.add(new SchoolMeeting());
		
		return team;
	}
	
	public TeamMikhail() {
		super("TeamMikhail", createTeam());
	}
	
}
