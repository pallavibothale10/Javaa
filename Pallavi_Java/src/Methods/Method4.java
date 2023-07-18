package Methods;

public class Method4 {
	
	public static void main (String[] args ) {
		
		//Static Regular method calling from different class
		
		System.out.println("Main method Started");
		
		//1. direct calling by method name
		//Test1();
		//Test2();
		
		//2. calling by class name
		
		Method3.Test1();
		Method3.Test2();
		Method4.Demo4();
		System.out.println("Main method Ended");

	}
	
	public static void Demo4()
	{
		System.out.println("Demo4 method");
	}

}
