class Shape{
	
	Shape(){
		System.out.println("Shape Class");
	}
	
	public double area(double base, double height, double width) {
		
		return 1;
	}
}

class Triangle extends Shape{
	public double area(double base, double height, double width) {
		
		return 1;
	}
}

class Rectangle extends Shape{
	public double area(double lentgh, double height, double width) {
		
		return 2;
	}
}

class Circle extends Shape{
	public double area(double lentgh, double height, double width) {
		
		return 3;
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape area;
		 
		area= new Circle();
		
		System.out.println(area.area(0, 0, 0));
		//Rectangle obj2= new Rectangle();
		//System.out.println(obj2.area(0, 0, 0));
		
		
	}

}
