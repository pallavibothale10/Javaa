package Polymorphism;

public class TestCar {
   public static void main(String[] args) {
	
	   Car C1 = new Car();
	   C1.Start();
	   C1.Refuel();
	   C1.Test();
	   C1.Stop();
	 System.out.println();
	   
	  Maroti M1 = new Maroti();
	  M1.Start();
	  M1.Refuel();
	  M1.Test();
	  M1.Stop();
	  M1.Theftydafty();
	System.out.println();
	
	//dynamic poly + Run time poly + top casting 
	//
	 Car C2= new Maroti();
	 C2.Start();
	 C2.Refuel();
	 C2.Test();
	 C2.Stop();
	
	// Maroti M2= new Car(); // down casting
	//class cast execution
	
	
	
   }
}
