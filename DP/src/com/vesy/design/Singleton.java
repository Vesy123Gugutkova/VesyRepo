package com.vesy.design;

public class Singleton {
	
	static Singleton uniqueInstance;
	
	private Singleton () {
		
	}
	
	public static Singleton getInstance () {
		if (uniqueInstance == null) {		
			uniqueInstance = new Singleton ();	
		}
		
		return uniqueInstance;
	}
}
