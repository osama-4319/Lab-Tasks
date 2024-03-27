
public class hello {

	public static void main(String[] args) {
		
		System.out.println("Simple for");
		int[] num = {1,2,3,5,5};
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("ForEach");
		
		for(int a:num)
		{
			System.out.println(a);
		}
		
		int c;
		add obj = new add(10,4);
		//c = obj.ad(3,4);
		//System.out.println(c);
		
		
		//Scanner Method
		obj.name();
	}

}
