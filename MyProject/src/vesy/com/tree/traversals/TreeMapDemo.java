package vesy.com.tree.traversals;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
	
	private static final String TEXT = "Test text words Count " +
			"words count teSt";
	public static void main (String [] args) {
		
		
		
	}
	
	private static Map<String, Integer> createWordsCounts(String text) {
		
		Scanner textScanner = new Scanner(text);
		Map<String, Integer> words = new TreeMap<String, Integer>();
		while (textScanner.hasNext()) {
			String word = textScanner.next();
			Integer count = words.get(word);			
			words.put(word, count + 1);
		}
		
		return words;
	}

}
