package com.vesy.design;

public class ChocolateBoiler {
	
	public static ChocolateBoiler chocolateBoiler;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler () {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance () {
		
		if (chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		
		return chocolateBoiler;
	}
	
	public void fill () {
		if (isEmpty()) {
			
			empty = false;
			boiled = false;
		}
	}
	
	public void boil ()  {
		if (!isEmpty() && !isBoiled() ) {
			boiled = true;
		}
	}
	
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled () {
		return boiled;
	}

}
