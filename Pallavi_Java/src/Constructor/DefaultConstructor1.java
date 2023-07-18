package Constructor;

public class DefaultConstructor1 {
	
	int Rollno;
	String Name;
	
	public DefaultConstructor1() {
		
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) {
		
		DefaultConstructor1 D1 = new DefaultConstructor1();
		DefaultConstructor1 D2 = new DefaultConstructor1();
		DefaultConstructor1 D3 = new DefaultConstructor1();
		
		D1.Method1(); //this call is for method RefVariableName.MethodName();
	}
	
	public void Method1() {
		System.out.println("Default Method");
	}

}
