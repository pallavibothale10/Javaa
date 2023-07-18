package AccessModifiers;

public class Default1 {
	int no = 100;
	
	public static void main(String[] args) {
		Default1 d1 = new Default1();
	    d1.m1();
	    d1.m2();
	    System.out.println(d1.no);
	}
	void m1() {
		System.out.println("Default Method :m1");
	}
	void m2() {
		System.out.println("Default Method :m2");
	}

}
