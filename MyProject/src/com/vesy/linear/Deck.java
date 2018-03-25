package com.vesy.linear;

import java.util.Stack;

public class Deck {
	
	public static void main (String [] args) {
		Stack<String> stack1 = new Stack<String> ();
		Stack<String> stack2 = new Stack<String> ();
		
		stack1.push("From Stack1 - Ivan");
		stack1.push("From Stack1 - Misho");
		stack1.push("From Stack1 - Pesho");
		stack1.push("From Stack1 - Ivo");
		
		stack2.push("From Stack2 - Dimi");
		stack2.push("From Stack2 - Vladi");
		stack2.push("From Stack2 - Ros");
		stack2.push("From Stack2 - Mos");
		
		while (stack1.size()> 0) {
			String name1 = stack1.pop();
			System.out.println(name1);
		}
		
		while (stack2.size()> 0) {
			String name2 = stack2.pop();
			System.out.println(name2);
		}
	} 

}
