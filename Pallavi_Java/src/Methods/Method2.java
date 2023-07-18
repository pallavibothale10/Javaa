package Methods;

public class Method2 {
	
	//Static regular method calling from same class
	
	public static void main (String[] args )
	{
		System.out.println("Main method started");
		
		//1. direct calling method name
		staticmethod1();
		staticmethod2();
		
		//2. calling by class name
		Method2.staticmethod1();
		Method2.staticmethod2();
		
		System.out.println("Main method ended");

	}

	public static void staticmethod1()
	
	{
		    int i = 13;
		    int j = 27;
		    int k = i+j;
		    
		    System.out.println("addiction of two no -->" +k);
	}
	
	public static void staticmethod2()
	
	{
		System.out.println("Static method calling from same class");
	}

}
