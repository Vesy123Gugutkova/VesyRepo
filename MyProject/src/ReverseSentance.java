
public class ReverseSentance {
	
	public static void main (String [] args) {
		String text = "C# is not C++ and PHP is not Delphi";
		ReverseSentance rs = new ReverseSentance();
		
		String reversed = rs.reverse(text);
		System.out.println(reversed);
	}
	
	
	
	public  String reverse (String text) {
		String toBeReversed[] = text.split("[ ]");
		StringBuilder sb = new StringBuilder();
		for (int i = toBeReversed.length-1;  i >=0; i--) {
			sb.append(toBeReversed[i] + " ");
		}
		
		return sb.toString();
	}

}
