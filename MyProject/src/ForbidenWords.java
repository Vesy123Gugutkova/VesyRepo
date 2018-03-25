
public class ForbidenWords {

	public static void main(String[] args) {
		String text = "Microsoft announced its next generation Java compiler today."
				+ " It uses advanced parser and special optimizer for the Microsoft JVM.";
		String forbidenWords = "Microsoft,Java,JVM";
		String result = findAndReplace(text, forbidenWords);
		System.out.println(result);
	}

	static String findAndReplace(String text, String forbidenWords) {
		String[] fbWords = forbidenWords.split("[,]+");

		String replaced = text;
		for (int i = 0; i < fbWords.length; i++) {
			int index = text.indexOf(fbWords[i]);

			if (index != -1) {
				int len = fbWords[i].length();
				String replacement = repeat(len, "*");
				replaced = replaced.replace(fbWords[i], replacement);

			}
		}
		System.out.println(replaced);

		return null;
	}

	public static String repeat(int count, String with) {
		return new String(new char[count]).replace("\0", with);
	}

}
