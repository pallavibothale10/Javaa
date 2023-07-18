package Polymorphism;

public class TestClass {
	public static void main(String[] args) {
		
		MethodOverridingChild C1= new MethodOverridingChild();
		C1.Bike();
		C1.Car();
		C1.Home();
		C1.Money();
		System.out.println();
		MethodOverridingFather F1=new MethodOverridingFather();
		F1.Car();
		F1.Home();
		F1.Money();
		System.out.println();
		
		MethodOverridingFather F2 =new MethodOverridingChild();
		F2.Home();
		F2.Money();
		F2.Car();// maroti
	}

}
