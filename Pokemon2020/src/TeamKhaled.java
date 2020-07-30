/*
 * Khaled AlBayaydah
 */
import java.util.ArrayList;

public class TeamKhaled extends PokeTeam {

	//method returns a team of the three subclasses of Pokemon
	public static ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> TeamNamnook = new ArrayList<Pokemon>();
		TeamNamnook.add(new Namekian());
		TeamNamnook.add(new Farmer());
		TeamNamnook.add(new Roshi());
		return TeamNamnook;
	}

	public TeamKhaled() {
		//Super method from PokeTeam
		super("TeamNamnook", createTeam());
		// TODO Auto-generated constructor stub
	}

}
