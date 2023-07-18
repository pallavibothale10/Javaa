package AccessModifiers;

public class Public1 {
	public int No= 100;
	public static void main(String[] args) {
		
		Public1 P1= new Public1();
	    P1.Name();   //non static   
	  
	   Public1.Name2(); //static
	}
	public void Name() {
		System.out.println("Public Non Static Method");
	}
	public static void Name2() {
		System.out.println("Public Static Method");
	}

}
