package String;

public class RevString {
	
	public static void main(String[] args) {
		
	String Str="pallavi";
	System.out.println(Str.length());
	String Rev="";
	for (int i = Str.length()- 1; i >= 0; i--) {
		Rev= Rev+ Str.charAt(i);
	}
	System.out.println(Rev);
}
}