
public class FindSubstring {
	
	public static void main (String [] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>. "
				+ "We don't have <upcase>anything</upcase> else.";
		String substring = "ar";
		//int count  = findSubstring (substring,text.toLowerCase());
		//System.out.println(count);
		
		String newString = toUpper(text);
		//System.out.println(newString);
	}
	
	static int findSubstring (String substring, String text) {
		int count = text.indexOf(substring);
		//System.out.println(count);
		while (count != -1 ) {
				count = text.indexOf(substring, count + 1);
				//System.out.println("The right one " + count);
		}
		//System.out.println(count);
		return count;
		
	}
	static String toUpper (String text) {
		String toUp = text.toUpperCase();
		System.out.println(toUp);
		String[] firstOne = text.split("(?<=(<upcase>))(\\w|\\d|\\n|[().,\\-:;@#$%^&*\\[\\]\"'+–/\\/®°⁰!?{}|`~]| )+?(?=(</upcase>))");
		for (int i = 0; i <firstOne.length ; i ++)  {
			firstOne[i].toUpperCase();
			System.out.println(firstOne[2].toUpperCase());
		}
		
		String helper = text.replaceAll("(?<=(<upcase>))(\\w|\\d|\\n|[().,\\-:;@#$%^&*\\[\\]\"'+–/\\/®°⁰!?{}|`~]| )+?(?=(</upcase>))", "test");
		System.out.println(helper);
		
		
		return helper;
	}

}
