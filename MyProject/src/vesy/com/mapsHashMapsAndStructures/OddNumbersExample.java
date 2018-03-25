package vesy.com.mapsHashMapsAndStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddNumbersExample {
	public static void main (String [] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6));
		HashMap<Integer, Integer> checked = checkNumbers(numbers);
		
		printWordsCount(checked);
	}
	
	static HashMap<Integer, Integer> checkNumbers(ArrayList<Integer> numbers) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer count = map.get(numbers);
		for (Integer number : numbers) {
			map.put(number, count + 1);
		}

		return map;

	}
	
	private static void printWordsCount(Map<Integer, Integer> wordsCounts) {
		for (Map.Entry<Integer, Integer> wordEntry : wordsCounts.entrySet()) {
			System.out.printf("word '%s' is seen %d times in the text%n", wordEntry.getKey(), wordEntry.getValue());
		}
	}
}
