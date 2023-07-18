package Constructor;

public class RulesOfConstructor {

	//1. We can not create a constructor inside the method/functions.
	
	//public RulesOfConstructor() {
		//}
	
	//2. Name of the constructor is same as class name.
	
	RulesOfConstructor() {
		
		System.out.println("Hello");
	}
	
	 //public void RulesOfConstructor() {
		//System.out.println("Hello1");
      //}
	//3.we should not declared any return type for the constructor like void
	// If u declared void keyword in constructor that time complier will treated as a method.
	
	//4. Application modifier/specifier --> public, private, protected
	//Not Applicable modifier/specifier--> static, final, abstracted,native
	     
	
	//5.Any number of constructor can be declared in java class but constructor
    //Name should be same as class name but argument parameter should be different
	
	public static void main(String[] args) {
		RulesOfConstructor RC= new RulesOfConstructor();
		// RC.RulesOfConstructor();
		
		
	}
}
