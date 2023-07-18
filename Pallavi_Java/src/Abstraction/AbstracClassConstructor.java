package Abstraction;

public abstract class AbstracClassConstructor {
		
	
		public AbstracClassConstructor( ) {
         
			this(300,400);
       
          System.out.println("Abstract Class Constructor");

		}
		
		private AbstracClassConstructor(int i) {
		System.out.println("One input param Constructor");
		}
		
		private AbstracClassConstructor(int i, int j) {
	          this(30);
         System.out.println ("Two input param Constructor");

}
}