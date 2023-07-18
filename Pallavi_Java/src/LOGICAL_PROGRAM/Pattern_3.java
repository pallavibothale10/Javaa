package LOGICAL_PROGRAM;

public class Pattern_3 {
	public static void main(String[] args) {
		
		/*o/p 	   C1 C2 C3 C4 C5
          R1       *  *  *  *  *
	      R2       *  *  *  *
	      R3       *  *  *
	      R4       *  *
	      R5       *                   */
		
		for(int i=1;i<=5;i++) {        // for printing row
			
			for(int j=1 ; j<=6-i ; j++) {
				
				System.out.print("*");	
				
			}
			System.out.println( );
		}
	}

}
