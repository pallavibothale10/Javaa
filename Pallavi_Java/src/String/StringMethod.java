package String;

public class StringMethod {
	public static void main(String[] args) {
		//charAt
		String S1= "python java";
		System.out.println(S1.charAt(7));
		
		//length
		String S2 ="automation";
		System.out.println(S1.length());
		System.out.println(S2.length());
		
		//toLowerCase
		System.out.println(S1.toLowerCase());
		
		//toUpperCase
		System.out.println(S1.toUpperCase());
		
		//equal equal
		String S3= "python java";
		String S4= new String ("python java");
		System.out.println(S1==S3);
		System.out.println(S1==S4);
		System.out.println();
		// .equal
		String S5 =new String ("Automation");
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S5));
        System.out.println(S1.equals(S4));
        System.out.println();
        //isEmpty
		String S6= "python java";
		String S7= "";
		String S8= " ";
		System.out.println(S8.isEmpty());
        System.out.println(S6.isEmpty());
		System.out.println(S7.isEmpty());
		System.out.println();
		//replace
		String S9="12/12/2023";
		System.out.println(S9.replace('_','z'));
        System.out.println(S9.replace('/', '-'));
        
        //replace all
		System.out.println(S6.replaceAll("python java","zzz zzz zzz zzz"));
		
		//substring
		System.out.println(S6.substring(1,8));//thon ja
		
		//last index
		System.out.println(S2.lastIndexOf('a'));
		
		//indexof
		String S10= "javaa automation";
		//System.out.print(S10.indexOf('a'));
		System.out.print(S10.indexOf('a',S10.indexOf('a')+1));
		System.out.println();
		
         //trim
		
		String S11 = "    manual testing java selenium    ";
		System.out.println(S11.trim());
		System.out.println(S11);
		
		//Split
		String S12="manual_testing_java_selenium";
       String S13 []= S12.split("_");
       for(int i = 0;i<S13.length;i++)
       {
    	  System.out.println(S13[i]); 
       }
	}
}
