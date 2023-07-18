package Constructor;

public class UserDefineConstructor {
  //Without Parameter Constructor
	
	//1. Variable declaration
	int Num1;
	int Num2; //non static global variable
	

	public UserDefineConstructor() {
	//2.Variable Initialization
		
		Num1= 10;
	    Num2 = 20;
		int add= Num1+Num2;
		
		//Use
		System.out.println(add);
	}
	public UserDefineConstructor(int a, int b) {
		Num1=a;
		Num2=b;
		int add= a+b;
		System.out.println(add);
	}
	
	public void Addition() {
		int sum = Num1+Num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		UserDefineConstructor UD = new UserDefineConstructor();
		//UserDefineConstructor UD1 = new UserDefineConstructor();
        UD.Addition();
		
	}
	
}
