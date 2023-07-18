package Polymorphism;

public class AutomaticPromotion {

	public static void main(String[] args) {
		AutomaticPromotion M1= new AutomaticPromotion();
		M1.Test1('A');
		M1.Test1(333l);
		M1.Test1(10d);
		
	}
	public void Test1() {
		System.out.println("Zero input parameters");
	}
	//public void Test1(int i) {
		//System.out.println("one input parameters");
	//}
	public void Test1(double d) {
		System.out.println("Double inpute parameter");
	}
	public void Test1(float f) {
		System.out.println("Float input parameter");
	}
	public void Test1(long d) {
		System.out.println("long input parameter");
	}
}
