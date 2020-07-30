import java.util.ArrayList;

public class NameGenerator {

	public static void main(String[] args) {
		String[] g = {"Talal","Rashed","Rui","Jad","Salah","Seokhyeon","Jafar","Ismail","Faris","Sanad"};
		
		
		
		
		
		
		
		
		
		ArrayList<String> ablock = new ArrayList<String>();
		for (String s : g) ablock.add(s);
	
		
		while (ablock.size()>0) {
		int i = (int)(Math.random()*ablock.size());
		System.out.println(ablock.remove(i));
		i = (int)(Math.random()*ablock.size());
		System.out.println(ablock.remove(i));
		
		System.out.println("\n\n");
		}
		
	}
	
	
}
