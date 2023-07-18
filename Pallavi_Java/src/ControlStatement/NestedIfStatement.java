package ControlStatement;

public class NestedIfStatement {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 300;
		
		if (a>b) {    // 100>200 is false
			if(a>c) {    // 200>300 is false
				System.out.println("a is the greatest number");
			}
		}
		else if(b>c) {      //200>300 is false
			System.out.println("b is the greatest number");
			
		}
		else
		{
			System.out.println("c is the greatest number");
		}
}
}