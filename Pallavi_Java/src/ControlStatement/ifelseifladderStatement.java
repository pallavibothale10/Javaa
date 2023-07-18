package ControlStatement;

public class ifelseifladderStatement {
	public static void main(String[] args) {
		
		int day =6;
		/* 1- sunday
		 * 2- monday
		 * -
		 * 7- saturday
		 */
		
		if(day==1)                           //1==6 is FALSE
		{
			System.out.println("Sunday");
		}
		else if (day==2)                     //2==6 is FALSE
		{
			System.out.println("Monday");
		}
		else if (day==3)                      //3==6 is FALSE
		{
			System.out.println("Tuesday");
		}
		else if (day==4)                      //4==6 is FALSE
		{
			System.out.println("Wednesday");
		}
		else if (day==5)                     //5==6 is FALSE
		{
			System.out.println("Thrusday");
		}
		else if (day==6)                      //6==6 is TRUE
		{
			System.out.println("Friday");
		}
		else if (day==7)                       //7==6 is FALSE
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid day");
		}
	}

}
