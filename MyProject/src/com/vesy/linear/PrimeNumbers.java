package com.vesy.linear;

import java.util.ArrayList;

public class PrimeNumbers {
	
	public static void main (String [] args) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers = getPrimesList(200,300);
		for (Integer i : primeNumbers) {
			System.out.println(i);
		}
		
	}
	
	public static ArrayList<Integer> getPrimesList(int start, int end) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		for (int num = start; num <= end; num++) {
			boolean prime = true;
			for (int div = 2; div < Math.sqrt(num); div++) {
				if (num % div == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				primesList.add(num);

			}

		}
		return primesList;
	}

}
