import java.util.Scanner;

class invalidAgeException extends Exception{
	public invalidAgeException(String str) {
		super(str);
	}
}

class Test{
	static void validate(int age) throws invalidAgeException{
		if(age<18) {
		throw new invalidAgeException("Abhi Bache ho");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}
}
public class main {

	public static void main(String[] args) {
		int age = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
		try {
			System.out.println("What is your age: ");
			age = scan.nextInt();
			Test.validate(age);
		}
		catch(invalidAgeException ex) {
			//System.out.println("Caught Exception");
			System.out.println("Caught Exception: " + ex);
		}
		}
		while (age <= 18);
		
		System.out.println("rest of the code..");
	}

}
