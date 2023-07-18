package Datatype;

public class NumericandNondecimal {

	public static void main (String[] args )
	{
		
		//primitive DataType (Numeric and Nondecimal)
	
		//Variable Declaration Rule
		//1. Must Not Begin With Digit
		//2.Should not be a keywords.
		//3.White Space is not allowed (* b1 is correct, b 2 is not accepted) 
		
		//1.   Byte DataType --> 1byte --> -128 to 127(value)
		//syntax --> DataType VariableName = Value
		
		byte b1 = 60;
		byte b2 = 127;
		//byte b3 = 128; //Not allowed -- Max value
		System.out.println("Byte data type -->" +b1);
		System.out.println("Byte data type Max Limit -->" +b2);
		
		byte b3 = -120;
		byte b4 = -128;
		//byte b5 = -129; //Not allowed -- Min value 
		System.out.println("Byte data type -->" +b3);
		System.out.println("Byte data type Min Limit -->" +b4);
		System.out.println();
		System.out.println("****************************");
		System.out.println();

		//2.  short DataType --> 2byte (8bit) (Value--> -32768 to 32767)
		//Syntax--> DataType VariableName = value;
		
		short s1 = 301;
		short s2 = 32767;
		//short s3 = 32768; //Not allowed -- Max value
		System.out.println("Short data type -->" +s1);
		System.out.println("Short data type Max Limit -->" +s2);
		
		short s3 = -112;
		short s4 = -32768;
		//short s5 = -32769;//Not allowed -- Min value
		System.out.println("Short data type -->" +s3);
		System.out.println("Short data type Min Limit -->" +s4);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		
		//3. int DataType --> 4byte(16bit) (Value--> -2147483648 to 2147483647)
		//Syntax--> DataType VariableName = value;
		
		int i1 = 50489;
		int i2 = 2147483647;
	
		//int i3 = 2147483648;  //Not allowed -- Max value
		System.out.println("Int data type -->" +i1);
		System.out.println("Int data type Max Limit -->" +i2);
		
		int i3 = -8769054;
		int i4 = -2147483648;
		//int i5 = -2147483649; //not allowed-- Min value
		System.out.println("Int data type -->" +i3);
		System.out.println("Int data type Min Limit -->" +i4);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		
		//4.long DataTpe --> 8byte(32 bit) (Value -9223372036854775808 to 9223372036854775807 )
	   //Syntax--> DataType VariableName = Value;
		
		long L1 =  2147483649222l ;
		long L2 = 9223372036854775807l;
		//long L3 = 9223372036854775808l;// Not allowed --max value
		System.out.println("Long data type --> " +L1);
		System.out.println("Long data type Max Limit --> " +L2);
		
		long L3 =  -2147483649222l ;
		long L4 = -9223372036854775808l;
		//long L5 = 9223372036854775809l;// not allowed --Min vlaue
		System.out.println("Long data type --> " +L3);
		System.out.println("Long data type Min Limit --> " +L4);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		
		
		}
	
}
