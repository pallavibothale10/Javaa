package Datatype;

public class NumerciAndDecimal {

	public static void main(String[] args) {
	
		//primitive DataType (Numeric and Decimal 33.2, -79.1)
		
		//1. Float DataType--> 4 byte (32 bit)
		//Syntax -- DataType VariableName =Value
		// Value Declaration And Initilization
		
		float F1 = 45.89f;
		float F2 = 80;
		/*we can store integer value in float DataType but 
		we can not store float value in int datatype */
		float F3 = 4567.9087f;
		float F4 = -76589.987f;
		float F5 = -6.97f;
		
		System.out.println("Float Data Type-->" +F1);
		System.out.println("Float Data Type-->" +F2);
		System.out.println("Float Data Type-->" +F3);
		System.out.println("Float Data Type-->" +F4);
		System.out.println("Float Data Type-->" +F5);
        System.out.println();
        System.out.println("**********************************");
        System.out.println();

        //2. Double DataType --> 8 byte (64 bit)
      //Syntax -- DataType VariableName =Value
        
        double D1 = 7898.98765d;
        double D2 = 908765.987654d;
        
        double D3 = -8907.7659d;
        double D4 = -78904.98706d;
        
        System.out.println("Double Data Type-->" +D1);
		System.out.println("Double Data Type-->" +D2);
		System.out.println("Double Data Type-->" +D3);
		System.out.println("Double Data Type-->" +D4);
	    
        
	}

}
