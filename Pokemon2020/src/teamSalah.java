

import java.util.ArrayList;

public class teamSalah extends PokeTeam {

	public teamSalah() {
		super("Team Salah", team());
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Pokemon> team(){
		ArrayList<Pokemon> ret = new ArrayList<Pokemon>();
		
		ret.add(new giannis());
		ret.add(new zion());
		ret.add(new bryant());
		
		return ret;
	}

	
	
}
