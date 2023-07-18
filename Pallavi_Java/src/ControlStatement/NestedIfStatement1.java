package ControlStatement;

public class NestedIfStatement1 {
	public static void main(String[] args) {
		
		//blood donation
		
		int age = 20;
		int weight = 66;
		if(age>=18)
		{
			if(weight>=50)
				{
				System.out.println("you are eligibal for blood donation");
				}
		}
		else if(weight<=50)
		{
			System.out.println("you are not eligibal fo blood donation");
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
	}

}
