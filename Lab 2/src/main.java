class mobile{
	String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	String model;
	int price;
	
	
}
public class main {

	public static void main(String[] args) {
		System.out.println("Osama Malik");
		mobile obj1 = new mobile();
		String brand, model;
		int price;
		obj1.setBrand("Huawei");
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
