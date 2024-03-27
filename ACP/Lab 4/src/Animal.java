public class Animal {
	
	Animal(){
		
		System.out.println("A Contr");
	}

	String name;
	public void eat(String name) {
		System.out.println("I am " + name);
	}
	
	public void test(String name) {
		System.out.println("I am Super Class " + name);
	}
	
}

class dog extends Animal{
	
	dog() {
		//super();
		System.out.println("D Contr");
	}
	//super.eat("abc"); Not Working
	public void eat(String name1, String name2) {
		super.eat(name1); 
		System.out.println("I am " + name2);
	}
	public void test(String name) {
		super.test(name);
		System.out.println("I am Child Class " + name);
	}
	
}
