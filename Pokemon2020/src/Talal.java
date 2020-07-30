import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Talal extends Pokemon {

	
	public Talal() {
		super("Talal", 1, 80, "Talal.png", new Move[] {
				new Move("his Hair", 1, 1, 2),
				new Move("his fist", 2, 2, 1),
				new Move("fire", 1, 1, 3),
				new Move("Football Knowledge", 3, 3, 2)
				
		});
	}
}