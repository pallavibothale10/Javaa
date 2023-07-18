package AccessModifiersDifferentPackage;

import AccessModifiers.Default1;
import AccessModifiers.Private1;
import AccessModifiers.Protected1;
import AccessModifiers.Public1;

public class TestClass extends Protected1 {

	public static void main(String[] args) {
		
		Public1 P1= new Public1();
	    P1.Name();   //non static   
	    Public1.Name2(); //static
	    System.out.println(P1.No);
	    
		Private1 P2= new Private1(); //accessible within class only
		//P2.Test1();
		//P2.Test2();
		
		Default1 d1 = new Default1();
	    //d1.m1();
	   // d1.m2();
	   // System.out.println(d1.no);
		
		//Protected1 P1 = new Protected1();
		//P1.M1();
		//P1.M2();
		//System.out.println(P4.number1);
		
	}
}
