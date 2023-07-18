package Constructor;

public class DefaultConstructor2 {
	
	//Default Constructor
	//public DefaultConstructor2() {
		//super();
	//}
	
	//Rule
	//1.It is always no argument/zero argument constructor
	//2.Access modifier of the default constructor is same as class modifier.
	//3.Default constructor contains only one line that is super() class/keywords
	
	//The default constructor is used to private the default values to the object 
	//example--> null,0,false

	public static void main(String[] args) {
		DefaultConstructor2 D2 = new DefaultConstructor2();
		DefaultConstructor2 D3 = new DefaultConstructor2();
		
		D2.M1();
		D2.M1();
		D2.addition();
		D3.addition();

	}
	public void M1() {
		System.out.println("Hello");
	}
	public void addition() {
		
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}

}
