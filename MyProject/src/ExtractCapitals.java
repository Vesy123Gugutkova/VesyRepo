
public class ExtractCapitals {
	
	public static void main (String [] args) {
		String text = "This is THE String To Be Checked";
		String upperLetters = extractCapitals (text);
		System.out.println(upperLetters);
	}
	
	static String extractCapitals(String text) {
		StringBuilder sb = new StringBuilder ();
		
		for (int i = 0; i <text.length(); i ++) {
			char ch = text.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
