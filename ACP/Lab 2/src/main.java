class mobile{
	String brand;
	String model;
	int price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}

}
public class main {

	public static void main(String[] args) {
		System.out.println("Osama Malik");
		mobile obj1 = new mobile();
		String brand, model;
		int price;
		obj1.setBrand("Audi");
		obj1.setModel("2015");
		obj1.setPrice(1200000);
		
		brand = obj1.getBrand();
		model =obj1.getModel();
		price =obj1.getPrice();
		
		System.out.println("Brand is " + brand);
		System.out.println("Model is " + model);
		System.out.println("Price is " + price);

	}

}
