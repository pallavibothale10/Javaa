package TypeOfVariable;

//static global variable in non static method 
public class Static_GlobalVariable_1 {
	
	static int Number= 300;    //Static Global variable
	
	public static void main(String[] args) {
		
		//syntax NonStatic--> ClassName Ref Variable= new ClassName
		//          Ref variable.MethodName();
		
		Static_GlobalVariable_1 Z= new Static_GlobalVariable_1();
		Z.M1();      //non static variable thats why we create an object
		Z.M2();      // Z is the reference variable 
		Z.M3();
		//Z.M4();
		
		//syntax static--> ClassName.MethodName();
		Static_GlobalVariable_1.M4(); ///Static method
	}

		public void M1()      //Non static method
		{
			System.out.println(Number);
			
		  Number = 200;
		}

		public void M2() 
		{
			System.out.println(Number);
			Number = 470;
			System.out.println(Number);
			
			Number = 800;
		}
		
		public void M3()
		{
			System.out.println(Number);
		}
		
		public static void M4()
		{
			System.out.println(Number);
		}
		
	
}