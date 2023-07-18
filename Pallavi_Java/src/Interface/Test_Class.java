package Interface;

public class Test_Class {
public static void main(String[] args) {
	
	//Calculator C1= new Calculator();
	//Casio C2= new Casio();
	
	AdvancedCalculators Ac= new AdvancedCalculators();
	//Static bind/early binding/Compile TP
	Ac.Addition(); Ac.Substraction();Ac.Multiplication();
	
	System.out.println();
	
	Ac.Tan(); Ac.Log();Ac.Addition(10);
	System.out.println();
	
	Ac.Sin();  Ac.Cos(); 
	System.out.println();
	
	Calculator C1 =new AdvancedCalculators(); 
	//Dynamic binding/late binding/RTP/ top casting/ up casting
    C1.Addition(); C1.Multiplication(); C1.Substraction();
    
    System.out.println();
    Casio C2 = new AdvancedCalculators();
    C2.Addition(10); C2.Log(); C2.Tan();
    		
    
}
}
