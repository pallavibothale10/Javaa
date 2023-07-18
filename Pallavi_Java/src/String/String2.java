package String;

public class String2 {
	public static void main(String[] args) {
		
		String S1= new String ("Test");//heap
		String S2= new String ("Test");

         String S3= "Test";//scp
         String S4= "Test";
         String S5= "Test";
         String S6= "test";
         String S7= new String ("test");
         
         System.out.println(S6==S7);
         System.out.println(S1==S3);
         System.out.println(S1==S2);
         System.out.println(S3==S4);

		
	}

}
