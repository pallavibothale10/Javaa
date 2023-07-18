package TypeOfVariable;

public class Non_Static_Global_Variable_2 {
	
	String name="Raju"; //non static global variable
	
	public static void main(String[] args) {
		
		/*Static Global Variable Call From Different Class*/
		//syntax--> System.out.println(DiffClassName.VariableName);
		System.out.println(Different_Class.name); //static global variable
		System.out.println(Different_Class.age1);
		
		
		/*Non Static Global Variable Call from Different Class*/
		//Non static global var thats why we create object
		//Syntax--> diffClassname refVariableName = new diffClassname();
		Different_Class DC = new Different_Class(); //Non static global variable
		
		//Syntax--> System.out.println(refVariableName.VariableName);
		System.out.println(DC.RollNumber);
		System.out.println(DC.name1);

		Non_Static_Global_Variable_2 obj = new Non_Static_Global_Variable_2();
		obj.Demo();
	}
	
	public void Demo() {
		int RR= 300; //local variable
		System.out.println(RR);
		System.out.println(name);
	}
	

}
