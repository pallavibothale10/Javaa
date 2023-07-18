package Methods;

public class Method10 {

	public static void main(String[] args) {
		
		// ***static regular method with parameter***
		
		Method10.addition(20, 30);   //calling by class name
		addition(20,80);             // direct calling by method name
		Method10.addition(5, 30);
		Method10.addition(22, 76);
		Method10.addition(20, 32);
		
		Method10.Substraction(65, 12);      //calling by class name
		Substraction(35, 12);                // direct calling by method name
		Method10.Substraction(32, 10);        
		Method10.Substraction(65, 18);
		
		Method10.Add(30, 15, 20);         //calling by class name
		Add(10, 25, 20);                   // direct calling by method name
		Method10.Add(65, 10, 45);
		Method10.Add(21, 11, 13);


	}
	
	
	public static void addition(int a, int b)      //(20, 30) //two input parameter method//{int a and int b are the parameters}
	{
		int c= a+b;
		System.out.println("addition of two no-->" +c);
		System.out.println();
		
	}
	
	
     public static void Substraction(int a, int b)    //(65, 12)  //two input parameter method
     {
		int c= a+b;
		System.out.println("Substraction of two no-->" +c);
		System.out.println();
	}
     public static void Add(int a, int b, int c)   //(30, 15, 20) //three input parameter method
     {
		int d= a+b-c;
		System.out.println("Addition of three no-->" +d);
		System.out.println();
	}
     
	
}

