import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Jafar extends Pokemon {

	
	public Jafar() {
		super("Jafar", 1, 60, "Jafar.jpg", new Move[] {
				new Move("his glasses", 1, 1, 2),
				new Move("his fist", 2, 2, 3),
				new Move("Tennis Racket", 1, 1, 1),
				new Move("his glasses", 3, 3, 2)
				
		});
	}
	
}