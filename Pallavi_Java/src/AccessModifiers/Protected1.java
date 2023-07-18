package AccessModifiers;

public class Protected1 {
//only public, abstract, final are permitted for the class
	protected int number1= 3000;
	
	
	public static void main(String[] args) {
		Protected1 P1 = new Protected1();
		P1.M1();
		P1.M2();
		System.out.println(P1.number1);
		
	}
	protected void M1() {
		System.out.println("Protected Method M1");
	}
	protected void M2() {
		System.out.println("Protected Method M2");
	}

}
