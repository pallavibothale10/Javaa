package Operators;

public class LogicalOperator {
	public static void main(String[] args) {
		
		boolean A = true;
		boolean B = true;
		System.out.println(A&&B);  //true
		System.out.println(A||B);   //true
		System.out.println();
		
		boolean A1 = true;
		boolean B1 = false;
		System.out.println(A1&&B1);  //false
		System.out.println(A1||B1);  //true
		System.out.println();
		
		boolean A2 = false;
		boolean B2 = false;
		System.out.println(A2&&B2);  //false
		System.out.println(A2||B2);  //false
		System.out.println();
		
		boolean A3 = false;
		boolean B3 = true;
		System.out.println(A3&&B3);  //false
		System.out.println(A3||B3);  //true
		System.out.println();
		
	}

}
