package Polymorphism;

public class MethodOverloading1 {
	public static void main(String[] args) {
		MethodOverloading1 M1= new MethodOverloading1();
		M1.Demo1();
		M1.Demo1(10);
		M1.Demo1("pallavi");
		M1.Demo1(15, 98);
		M1.Demo1(12, 23, 34.5d);
		
	}
	public void Demo1() {
		System.out.println("no argument");
	}
	public void Demo1(int i) {
		System.out.println("one input int parameter");
	}
	public void Demo1(String i ) {
		System.out.println("one input string parameter");
	}
	public void Demo1(int i, int j) {
		System.out.println("two input parameter");
	}
	public void Demo1(int i, int j, double d) {
		System.out.println("three input parameter");
	}
}
