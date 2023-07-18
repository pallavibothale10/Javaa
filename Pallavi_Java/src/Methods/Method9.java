package Methods;

public class Method9 {
	
	public static void main(String[] args) {
		
		//1 Method Without Parameter/ Zero parameter
		
		Method9 M9 = new Method9();
		M9.addition();
		M9.addition1(); //warning show because in static method we create object creation * in line 15 and 16 is the correct way
		M9.addition2();
		
		//calling by class name 
		Method9.addition1(); // ClassName.methodNAme();
		Method9.addition2();

	}
	public void addition()       //non static regular method
	{
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("Addition of two no -->" +c);
		
	}
	
	public static void addition1()      //static regular method
	{
		int a = 10;
		int b = 30;
		int c= a+b;
		
		System.out.println("Addition of two no-->" +c);
	}
	public static void addition2()
	{
		int a = 20;
		int b = 40;
		int c= a+b;
		
		System.out.println("Addition of two no-->" +c);
	}
	
	
}
