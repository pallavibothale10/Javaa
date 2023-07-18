package ControlStatement;

public class ifelseifladderStatement3 {
	public static void main(String[] args) {
		
		String city = "Pune";
		
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
		
		if(city == "Delhi")
		{
			System.out.println("city is Delhi");
		
	}
		else if (city == "mumbai")
		{
			System.out.println("city is mumbai");
		}
		else if (city == "wani")
		{
			System.out.println("city is wani");
			
		}
		else if (city == "Pune")
		{
			System.out.println("city is pune");
			
		}
		else
		{
			System.out.println("no match found");
		}
	
	}
}
