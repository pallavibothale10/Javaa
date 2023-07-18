package ControlStatement;

public class ifelseifladderStatement2 {
	public static void main(String[] args) {
		
		/*If ElseIf Ladder Statement Syntax-->
		 * 
		 * if(condition1){
		 * Statement1 is executed when condition1 is TRUE
		 * }
		 * else if(condition2){
		 * Statement2 is executed when condition2 is TRUE
		 * }
		 * else if(condition3){
		 * Statement3 is executed when condition3 is TRUE
		 * }
		 * else{
		 * Statement4 is executed when all condition are FALSE
		 * }
		 */
		
		int marks = 50;
		if(marks >= 65)
		{
			System.out.println("Distinction");
		
	}
		else if (marks >= 60)
		{
			System.out.println("First Class");
		}
		else if (marks >= 55)
		{
			System.out.println("Higher Secondary");
			
		}
		else if (marks >= 50)
		{
			System.out.println("Secondary");
			
		}
		else if (marks >= 35)
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Failed");
		}
	
	}

}
