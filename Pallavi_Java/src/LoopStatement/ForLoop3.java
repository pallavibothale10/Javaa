package LoopStatement;

public class ForLoop3 {

	public static void main(String[] args) {
		
		//W A P to print 5 to 20 number using for loop
		//starting point --> 5
		//ending point --> 20
		//inc/dec
		//  5<=20   is true
		//  6<=20   is true
		//  7<=20   is true
		//  -----
		//  20<=20 is true
		//  20<=21 is false
		
		for(int number = 5; number<=20; number++)
		{
			System.out.println(number);
		}
		
		System.out.println("Loop completed");
	}
}
