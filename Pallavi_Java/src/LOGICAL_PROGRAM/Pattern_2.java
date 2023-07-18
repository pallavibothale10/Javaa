package LOGICAL_PROGRAM;

public class Pattern_2 {
	public static void main(String[] args) {
		
		/*o/p 	   C1 C2 C3 C4 C5
          R1                    *
	      R2                 *  *
	      R3              *  *  *
	      R4           *  *  *  *
	      R5        *  *  *  *  *        */
		
		for(int i= 1; i<=5;i++) { /// i is for row
			
			for(int j=1; j<=5-i; j++) { // j is for space in column
				System.out.print(" ");
				}
			
		for(int k=1; k<=i; k++)	{ // k is for column *
			System.out.print("*");
		}
		System.out.println();

		}
	
	}

}
