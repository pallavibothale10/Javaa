package TypeOfVariable;

public class MyProGlobalVariable_1 {
	
	static int i = 10;  //static global variable
	static int j = 20;
	
	int k= 30;         //Non Static Global Variable
	
	public static void main(String[] args) {
		MyProGlobalVariable_1.m1();
		MyProGlobalVariable_1.m2();
		
		MyProGlobalVariable_1 Z = new MyProGlobalVariable_1();
		Z.m3();     //m3 is the non static method that why we create object
		
	}
	
	
	public static void m1()
	{
		System.out.println(i); //static global variable
	}
	
	public static void m2()
	{
		System.out.println(j);
	}
	
	public void m3()
	{
      System.out.println(k);    //non static global variable
	}

}
