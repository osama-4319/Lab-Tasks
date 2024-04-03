interface A{
	void show();
	void settings();
}

interface x{
	void run();
}

class B implements A,x{
	public void show(){
		System.out.println("In Show A");
	}
	
	public void settings(){
		System.out.println("The config and settings");
	}
	
	public void run(){
		System.out.println("In Runiing mode");
	}
}
public class main {

	public static void main(String[] args) {
		B obj;
		obj = new B();
		obj.show();
		obj.settings();
		obj.run();
	}

}
