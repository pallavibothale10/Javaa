package Constructor;

public class NeedOfConstructor {
	
	public NeedOfConstructor() {
		
		System.out.println("Default Constructor");
		
	}
	String name;       //non static global variable //String - null(default value)
	int RollNo;        // int - 0 (default value)
	                   //boolean - False(default value)
	
	public static void main(String[] args) {
		NeedOfConstructor S1 = new NeedOfConstructor();
		NeedOfConstructor S2 = new NeedOfConstructor();
	
		NeedOfConstructor S100 = new NeedOfConstructor();
		NeedOfConstructor S200 = new NeedOfConstructor();
	}
	
	public void M1() {
		System.out.println(name+" "+RollNo);
	}
	public void M2() {
		System.out.println(name+" "+RollNo);
	}

 /* purpose of constructor*/
	
	//1.once we create and object compulsory we required to perform initialization for that object
	//2.The constructor is specially designed to perform initialization of object
	//3.Constructor is a special type of method
	//4.Every time an object is created using new keyword at least one constructor is called
}
