
public class Dog {
	
	private String name;
	
	
	Dog () {
		this.name = "Sharo";
	}
	
	Dog (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bark() {
		System.out.printf("Dog %s said: Wow-wow!%n", name);
	}

}
