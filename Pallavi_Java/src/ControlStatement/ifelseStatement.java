package ControlStatement;

public class ifelseStatement {

	public static void main(String[] args) {
     
		int a = 10;
		int b = 20;
		int c = a+b;
		
		/* If Else Statement syntax-->
		 * if(condition){
                       statement1 // executed when condition is true
	                }
		 else{
		               Statement2 //executed when condition is false
		 }  */
		
		
		if(c>=20)
		{
			System.out.println("c is greater than 20");
		}
		else {
			System.out.println("c is not greater than 20");
		}
		
		System.out.println("Program Complete");
		
	}

}
