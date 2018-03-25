
public class MyClass {

	public static void main(String [] args) {
		String msg = "Stand up, stand up, balkan superman";

		System.out.printf("msg = \"%s\"%n", msg);
		System.out.printf("msg.length() = %d%n", msg.length());

		for (int i = 0; i < msg.length(); i++) {
			System.out.printf("msg[%d] = %c%n", i, msg.charAt(i));
		}
		
		//String string ="Introduction in Java";
		//int index = string.indexOf("Java");
		//System.out.println(index);
		
		//int index1 = string.lindexOf("Java");
		
		String quote = "The main subject in the \"Intro Java\"" + " book is Java for Java newbies.";
		int index = quote.indexOf("Java");
		
		while (index != -1) {
			System.out.println("Java found on index " + index);
			index = quote.indexOf("Java", index+1);
		}
		
		String path = "C:\\Pics\\Rila2008.jpg";
		int indexNew = path.lastIndexOf("\\");
		String fileName = path.substring(indexNew + 1);
		System.out.println(fileName);
		
		String listOfBeers = "Kamenica, Stela, Zagorka";
		String [] listOfBeersInArray = listOfBeers.split("[ ,.]");
		
		for (int i = 0; i <listOfBeersInArray.length; i ++) {
			System.out.println(listOfBeersInArray[i]);
		}
		
	}

}
