import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Ryuji extends Pokemon {

	
	public Ryuji() {
		super("Ryuji", 1, 70, "Ryuji.jpeg", new Move[] {
				new Move("Morning Reflection", 1, 1, 2),
				new Move("fist", 2, 2, 1),
				new Move("DC", 1, 1, 3),
				new Move("Homework club", 3, 3, 3)
				
		});
	}
}
	