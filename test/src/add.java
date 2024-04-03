import java.util.Scanner;
public class add {
	public int ad(int a, int b) 
	{
	return a+b;
	}
	
	public int sub(int a, int b) 
	{
	return a-b;
	}
	
	// Input Method
	public void name() {
		System.out.println("Enter Name");
		Scanner Sc = new Scanner(System.in);
		String a = Sc.next();
		String b = Sc.nextLine();
		System.out.println(a + b);
		
	}
	//Constructor
	add (int a, int b)
	{
		System.out.println("Addition= " + ad(a,b));
		System.out.println("Subtraction= " + sub(a,b));
	}
}
