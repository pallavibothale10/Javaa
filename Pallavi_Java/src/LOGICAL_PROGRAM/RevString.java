package LOGICAL_PROGRAM;

public class RevString {
	public static void main(String[] args) {
		
		String Str= "Manual and Automation Testing";
		String Str1 []= Str.split(" ");
		System.out.println(Str1.length);
		String rev=" ";
		for(int i = Str1.length-1; i>=0;i--) {
			
			rev = rev + Str1[i] + " ";
			
		}
		System.out.println(rev);
	}

}
