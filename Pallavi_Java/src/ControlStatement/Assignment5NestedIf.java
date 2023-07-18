package ControlStatement;

public class Assignment5NestedIf {
	public static void main(String[] args) {
		
		/*if(condition 1) {    
			statement 1; //executes when condition 1 is true   
			if(condition 2) {  
			statement 2; //executes when condition 2 is true   
			}  
			else{  
			statement 2; //executes when condition 2 is false   
			}  
			}*/
		
		int year= 2005;
		if(year%400==0|| year%100!=0 ){
			
		 if(year%4==0 ) {
			 
				System.out.println("year is a leap year " +year);
			}
			else {
				
				System.out.println("year is not a leap year " +year);
			}
		}
		
	}

}
