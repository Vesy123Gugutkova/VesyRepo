import java.util.Date;

public class CatalogApplication {

	public static void main(String[] args) {
		String catalog = "MicrowaveOven: 170, \n" + "AudioSystem: 125, \n" + "TV: 315, \n" + "Refrigerator: 400";
		// System.out.println(catalog);

		String[] products = catalog.split("[\\d\\s,:]+");
		for (String product : products) {
			System.out.println(product);
		}

		String[] prices = catalog.split("\\D+");
		for (String price : prices) {
			System.out.print(price + " ");
		}
		System.out.println(new Date());
		String collector = "Numbers: ";
		for (int idx = 0; idx<50000; idx ++) {
			collector += idx;
		}
		System.out.println(collector.substring(0, 1024));
		System.out.println(new Date());
	}

}
