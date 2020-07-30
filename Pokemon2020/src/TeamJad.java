import java.util.ArrayList;

public class TeamJad extends PokeTeam {

// 2*(total health) + (total damage dealt by all moves) + 30*(number of moves that cause an effect) = 1050	
	public static ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		list.add(new Talal());
		list.add(new Jafar());
		list.add(new Ryuji());
		
		return list;
	}
	
	public TeamJad() {
		super("TeamJad", createTeam());
	}

}
