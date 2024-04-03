import java.util.Scanner;
class Box{
	private double length, width, height;
	
	Box (double length, double width, double height){
		this.setHeight(height);
		this.setLength(length);
		this.setWidth(width);
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getSurfaceArea() {
		double area;
		area = 2 * (this.getLength() * this.getWidth()) + 
				2 * (this.getLength() * this.getHeight()) +
				2 * (this.getWidth() * this.getHeight());
		return area;
	}
	
	public double getLSurfaceArea() {
		double area = 1;
		area = 2 * (this.getLength() * this.getHeight()) + 
				2 * (this.getWidth() * this.getHeight());
		return area;
	}
	
	public double getVolume() {
		double area = 1;
		area = this.getLength() * this.getWidth() * this.getHeight();
		return area;
	}
}
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length= ");
		double length = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter width= ");
		double width = Double.parseDouble(scan.nextLine()); 
		
		System.out.println("Enter height= ");
		double height = Double.parseDouble(scan.next());
		
		Box obj1 = new Box(length, width, height);
		
		System.out.printf("Surface Area - %.2f\n" , obj1.getSurfaceArea());
		System.out.printf("Lateral Surface Area - %.2f\n", obj1.getLSurfaceArea());
		System.out.printf("Volume - %.2f\n" , obj1.getVolume()); //to Print 2 decimal after .

	}

}
