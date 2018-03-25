
public class WordReverser {
	
	public static void main (String [] args) {
		String string = "To reverse";
		String reversed = reverse(string);
		System.out.println(reversed);
	}
	
	static String reverse (String text) {
		StringBuilder sb = new StringBuilder ();
		for (int i = text.length()-1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		
		return sb.toString();
	}

}
