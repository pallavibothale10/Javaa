package Polymorphism;
//Example -->run time Polymorphism
public class MethodOverridingChild extends MethodOverridingFather{
	
	public void Bike() {
		System.out.println("Bike-->FZ");
	}
	@Override
	public void Home() {
		System.out.println("Home-->1BHK");
	}
	@Override
	public void Car() {
		System.out.println("Car-->Maroti");
	}
	public static void main(String[] args) {
		
	MethodOverridingChild C1= new MethodOverridingChild();//static poly
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
	
	//overriding
	//child class object can be referred by parent class ref variable
	MethodOverridingFather F2 =new MethodOverridingChild();//dynamic poly/run time poly
	F2.Home();
	F2.Money();
	F2.Car();// maroti
}}
