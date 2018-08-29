
public class CeasarCypher {

	private int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	public CeasarCypher (int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0,key);
		Sring rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		
	}
}
