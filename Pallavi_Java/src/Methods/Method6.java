package Methods;

public class Method6 {
	
	//Non static regular method calling from same class
	
	public static void main( String[] args)
	{
		System.out.println("Main Method Statred");
		
		//OBJECT CREATION
		//Syntax - ClassName ReferencevariablName = new ClassNmae();
		
		Method6 Test = new Method6();
		//We need to create first object of class
		//After creating the object copy of all the non static methods will be store in the object 
		
		Test.m1();
		Test.m2();
		Test.m3(); //static method 

		System.out.println("Main Method Ended");

		//Question 
        //Can I access Static method by using object reference? yes/no
		// Ans-- YES we can access static method but it will throw warning message
		// Message-- The Static Method m3() from the type Method6 should be accessed in a static way
	}
	
	public void m1()
	{
		System.out.println("Non static regular method calling from same class --> m1");
	}
	public void m2()
	{
		System.out.println("Non static regular method calling from same class --> m2");
	}
	public static void m3()
	{
		System.out.println("Static Method -->m3");
	}
}