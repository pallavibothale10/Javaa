package String;

public class String1 {
	public static void main(String[] args) {
		
		//By using sting literal
		// SYNTAX--> String variable="value";
		String Str1= "Automation"; //scp memory
		String Str2="Automation";
		
		//By using new Keyword
		//SYNTAX--> String  variable =new variable ("value");
		String S1= new String ("java"); //heap memory
		String S2= new String ("java");
		String S3= new String ("Automation");
		
		System.out.println(Str1==Str2);
		System.out.println(S1==S2);
		System.out.println(Str1==S3);



		
		
		
	}

}
