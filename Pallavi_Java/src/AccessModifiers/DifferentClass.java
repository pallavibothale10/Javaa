package AccessModifiers;

public class DifferentClass {
	public static void main(String[] args) {

		Public1 P2= new Public1();
	    P2.Name();   //non static   
	   Public1.Name2(); //static
	   
	   Default1 d1 = new Default1();
	    d1.m1();
	    d1.m2();
	    System.out.println(d1.no);

	   Protected1 P3 = new Protected1();
		P3.M1();
		P3.M2();
		System.out.println(P3.number1);
		
	}

}
