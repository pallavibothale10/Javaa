package LOGICAL_PROGRAM;

public class Pattern_4 {

	/*		  C1 C2 C3 C4 C5
	   R1     *  *  *  *  *
       R2     *  *  *  *
	   R3     *  *  *
	   R4     *  *
	   R5     *               */

	public static void main(String[] args) {

		for(int i = 1; i<= 5; i++) {
			for(int j= 5; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
