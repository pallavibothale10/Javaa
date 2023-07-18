package TypeOfVariable;

public class LocalVariable_1 {
	
	
	public static void main(String[] args) {
		LocalVariable_1.m1();
		
		LocalVariable_1.m2();
		
	}
	
	public static void m1() {
		int RollNo= 20;               //non static local variable
		String Name= "rahul"; 
		 /*int static name1 =10;--> We can not declared static variable inside
		 the main method body or any kind of methods of the class*/
	
		
		System.out.println(RollNo);
		System.out.println(Name);
		
		//System.out.println(abc);
	}
	public static void m2() {
		int abc= 30;
		System.out.println(abc);
	}
}
