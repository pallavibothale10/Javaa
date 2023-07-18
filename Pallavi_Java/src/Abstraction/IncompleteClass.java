package Abstraction;

public abstract class IncompleteClass {

	public IncompleteClass() {
		
	}
	public void Demo1() {  //Method declaration //Non Abstract method
		System.out.println("Demo Method");    //Method
	}
	public abstract void Demo2();    //Abstract method
	
	public abstract void Demo3();      //Abstract method
	public static void main(String[] args) {
		
		//IncompleteClass IC = new IncompleteClass();
		//We can not create the object of Abstract Class 
	}

}
