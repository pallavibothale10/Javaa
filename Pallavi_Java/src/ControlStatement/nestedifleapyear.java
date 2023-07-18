package ControlStatement;

public class nestedifleapyear {
	public static void main(String[] args) {
		
	
	int Year= 2004;
	
	if(Year%400==0) {
		
		System.out.println("The Year is Leap Year:"+Year);
	}
	else if(Year%100==0) {
		
		System.out.println("The Year not is Leap Year:"+Year);
	}
	else if(Year%4==0) {
				
				System.out.println("The Year is Leap Year:"+Year);
			}
	else {
		
		System.out.println( "Year is not leap year:"+ Year);
	}

}
}
