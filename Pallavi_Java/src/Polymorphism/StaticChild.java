package Polymorphism;

public class StaticChild extends Static1 {

	public static void main(String[] args) {

		StaticChild Sc = new StaticChild();
		Sc.Demo2();
		Sc.Demo1();
		}
	public void Demo2() {
		System.out.println("Child Method");
		
	}
	public static void Demo1() { // method hiding
		System.out.println("Parent class static mehod : Demo5");
	}

}
