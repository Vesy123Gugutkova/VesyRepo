

public class GSM {
	
	 static String nokia95 = "This is Nookia95";
	 
	 public static String getModelNokia () {
		 return nokia95;
	 }
	 private String model;
	 private String manifacturer;
	 
	 private int price;
	 private String owner;
	 
	 private Battery battery;
	 private Display display;
	 
	 GSM (String model) {
			this(model, null);
		}
		
		GSM (String model, String manifacturer) {
			this(model,manifacturer,0);
		}
		
		GSM (String model, String manifacturer, int price) {
			this(model,manifacturer,price,null);
		}
		
		GSM (String model, String manifacturer, int price, String owner) {
			this(model,manifacturer,price,owner,null);
		}
		
		
		GSM (String model, String manifacturer, int price, String owner, Battery battery) {
			this(model,manifacturer,price,owner,battery,null);
		}
		
		/*GSM (String model, String manifacturer, int price, String owner, Battery battery, Display display) {
			this(model,manifacturer,price,owner,battery,battery,null);
		}*/
		
		/*GSM (String model, String manifacturer, int price, String owner, Battery battery, Display display) {
			this(model,manifacturer,price,owner,battery,battery,null);
		}*/
		
		GSM (String model, String manifacturer, int price, String owner, Battery battery, Display display) {
			this.model = model;
			this.manifacturer = manifacturer;
			this.price = price;
			this.owner = owner;
			this.battery = battery;
			this.display = display;
			
		}
		
		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getManifacturer() {
			return manifacturer;
		}

		public void setManifacturer(String manifacturer) {
			this.manifacturer = manifacturer;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Battery getBattery() {
			return battery;
		}

		public void setBattery(Battery battery) {
			this.battery = battery;
		}

		public Display getDisplay() {
			return display;
		}

		public void setDisplay(Display display) {
			this.display = display;
		}
}
