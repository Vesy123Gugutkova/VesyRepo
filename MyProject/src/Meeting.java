import java.util.Scanner;

public class Meeting {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Write First Dogs Name: ");
		String firstDogsName = input.nextLine();
		
		Dog firstDog = new Dog(firstDogsName);
		
		System.out.print("Write second dog's name: ");
		Dog secondDog = new Dog();
		
		secondDog.setName(input.nextLine());
		
		Dog thirdDog = new Dog ();
		
		Dog [] dogs = {firstDog, secondDog,thirdDog };
		
		for (Dog dog : dogs) {
			dog.bark();
		}
		
		
	} 

}
