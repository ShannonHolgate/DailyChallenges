import java.util.HashMap;
public class Alpha {

	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();

	public static void main(String[]args) throws Exception{
		setupAlp();	
	}

	static void setupAlp() {
		char letter = 'a';
		for(int i = (int)'a'; i<=(char)'z';i++) {
			map.put(letter,0);
		}
	}
}