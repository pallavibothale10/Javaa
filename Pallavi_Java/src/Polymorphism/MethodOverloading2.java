package Polymorphism;

public class MethodOverloading2 { 
	public static void main(String[] args) {
		
		MethodOverloading2 M2= new MethodOverloading2();
		M2.addition(10, 20);
		M2.addition(10, "Rupesh"); //non static method
		MethodOverloading2.Demo1();// static method
		MethodOverloading2.Demo1(10);
	}
	public void addition(int i,int j) {
		int sum=i+j;
		System.out.println(sum);
		
	}
	public void addition(int i, String a) {
		System.out.println("two input parameter method ");
	}
	
	public static void Demo1() {
		System.out.println("no argument Static method");
	}
	public static void Demo1(int i ) {
		System.out.println("One input parameter static method");
		
	}
}
