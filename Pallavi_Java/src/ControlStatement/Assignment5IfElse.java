package ControlStatement;

public class Assignment5IfElse {

	public static void main(String[] args) {
		
		int year= 1996;
		
		if(year%400==0 && year%100!=0 || year%4==0)
		{
			System.out.println("year is leap " +year);
		}
		else {
			System.out.println("year is not a leap "+year);
		}
	}
}
