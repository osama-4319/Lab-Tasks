package pak_main;
import pak_basicAction.*;

public class main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicAction math = new basicAction();
		System.out.println(math.sum(2,2));
		System.out.println(math.sum(3,3,3));
		System.out.println(math.sum(4,4,4,4));
	}
}