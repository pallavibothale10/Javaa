package TypeOfVariable;

public class Static_Global_Variable_2 {

	static int number = 100;
	static String name = "rahul";
	
	public static void main(String[] args) {
	//Static Global Variable Call from same class
		//Creating variables outside the method/functions is known as Global Variable
		Static_Global_Variable_2.Demo1();
		Static_Global_Variable_2.Demo2();
		
		Static_Global_Variable_2 obj = new Static_Global_Variable_2();
		obj.Demo3();
		
	}
	public static void Demo1() {
		System.out.println(number);
		System.out.println(name);
		System.out.println();
		
		number= 500;
		name= "Rani";
	}
	public static void Demo2() {
		System.out.println(number);
		System.out.println(name);
		System.out.println();
	}
	public void Demo3() {
		System.out.println(number);
		System.out.println(name);
	}
	
}
