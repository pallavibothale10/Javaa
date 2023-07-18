package Arrays;


public class Array7 {
	public static void main(String[] args) {
		
		String S1[]= new String[3]; //
		String S2[][]= new String[4][5];// two d array
		
         System.out.println(S1.length);
         System.out.println(S2[2].length);
		
	//initilization
         //row and colume
         
         //First Row
         S2[0][0]="A1";
         S2[0][1]="A2";
         S2[0][2]="A3";
         S2[0][3]="A4";
         S2[0][4]="A5";
         System.out.println(S2[0][3]);
         
         //Second Row
         S2[1][0]="B1";
         S2[1][1]="B2";
         S2[1][2]="B3";
         S2[1][3]="B4";
         S2[1][4]="B5";
         
         //Third Row
         S2[2][0]="C1";
         S2[2][1]="C2";
         S2[2][2]="C3";
         S2[2][3]="C4";
         S2[2][4]="C5";
         
         //Fourth Row
         S2[3][0]="D1";
         S2[3][1]="D2";
         S2[3][2]="D3";
         S2[3][3]="D4";
         S2[3][4]="D5";

                    //0<4 is true
     for(int Row= 0; Row<4;Row++) { // row
    	 
    	                  //0<5 is true
    	                  //1<5 true
    	                  //2<5 true
    	                  //3<5 true
    	                  //4<5 true
    	                  //5<5 is false
    	 for(int colume=0;colume<5; colume++) {
    		
    		 System.out.print(S2[Row][colume] +" " );
    	 }
     }
         

}
}