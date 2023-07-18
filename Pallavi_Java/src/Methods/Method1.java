package Methods;

public class Method1 {

	public static void main(String[] args) {
     
		//Static Regular method calling from same class
		
		System.out.println("Main Method Started");
		
		//1. direct calling method name
	   // Syntax --> MethodName();
		Demo1();
		Demo2();
		
		//2. Calling by ClassName
		//syntax--> ClassName.methodname();
		
		Method1.Demo1();
		Method1.Demo2();
		
		System.out.println("Main method ended/completed");

	}
	
     public static void Demo1()
{
	System.out.println("Static regular method calling from same class --> Demo1");
}
     public static void Demo2()
{
	System.out.println("Static regular method calling from same class --> Demo2");

}

}
