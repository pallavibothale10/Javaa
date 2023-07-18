package String;

public class reverseString {
	public static void main(String[] args) {
		
		String str= "Welcome to java and Automation";
	
		String str1[]=str.split(" ");
		System.out.println(str1.length); 
//here we are find out the arry of length so there is no need ()bcoz in arry length is variable only
	    String rev = "";
	    
	   for (int i = str1.length - 1; i >= 0; i--) {
		   
	     rev = rev + str1[i]  +" ";
		
	   }
	   System.out.println(rev);
	}

}
