package ThisAndSuper;

public class Sample1 {
    int Number = 100; // non static global variables
	int Num = 200;
	String Name= "Automation";
	//What is use of this keyword
	//This keyword is used to access global variables from same class

	public void Test1() {
		int Number = 400;
		int Num = 600;

		System.out.println(Number);
		System.out.println(Num);
		System.out.println(Name);
		System.out.println();
		System.out.println(this.Number);
		System.out.println(this.Num);


	}
	public static void main(String[] args) {
		
		Sample1 S1= new Sample1();
		S1.Test1();
	}
}
