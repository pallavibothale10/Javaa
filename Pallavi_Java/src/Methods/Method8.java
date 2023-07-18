package Methods;

public class Method8 {
	
	public static void main (String[] args )
	{
		//Method7.m4();
		//Method7.m5();
		
		//OBJECT CREATION
		// Syntax-- ClassName referenceVariable = new Classname();
		
		Method7 obj = new Method7();
		obj.m4();
		obj.m5();
		
		Method8 obj1 = new Method8();
		obj1.m6();
		
	}
	public void m6()
	{
		System.out.println("non static regular method calling from different class-->m6");
	}
	 
}
