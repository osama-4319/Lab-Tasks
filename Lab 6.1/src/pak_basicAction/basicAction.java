package pak_basicAction;

public class basicAction {
	//constructor
	public basicAction(){
		System.out.println("Object successfully created of class basicAction");
	}
	//sum Methods (Function overloading)
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public int sum(int w, int x, int y, int z) {
		return w+x+y+z;
	}
}
