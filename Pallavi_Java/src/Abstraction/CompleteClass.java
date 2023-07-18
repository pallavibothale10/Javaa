package Abstraction;

public class CompleteClass {
	public static void main(String[] args) {
		CompleteClass CC= new CompleteClass();
		CC.Test1();
		CC.Test1(10);
		
	}
	public void Test1() {        //method declaration
		System.out.println("Test1 method");  //method defination
	}
	public void Test1(int i) {        //method declaration
		System.out.println("Test method");   //method defination
	}

}
