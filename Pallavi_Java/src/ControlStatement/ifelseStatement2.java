package ControlStatement;

public class ifelseStatement2 {

	public static void main(String[] args) {

		int Marks = 50;
		int Marks1 = 15;
		
		/* If Else Statement syntax-->
		 * if(condition){
                       statement1; // executed when condition is true
	                }
		 else{
		               Statement2; //executed when condition is false
		 }      */
		      
		 if(Marks1>=35) {
			 System.out.println("Result-->Pass");  //executed when (marks>=35)--> (50>=35)
		 }
		 else {
			 System.out.println("Result-->Failed"); //executed when (marks>=35)--> (15>=35)
		 }
		
		 System.out.println("Program Completed");
	}

}
