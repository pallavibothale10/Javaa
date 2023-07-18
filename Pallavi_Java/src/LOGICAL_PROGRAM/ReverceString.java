package LOGICAL_PROGRAM;

public class ReverceString {
	public static void main(String[] args) {
		
		String S="Pallavi";
		System.out.println(S.length());
		String Rev="";
		for(int i = S.length()-1;i>=0;i--)
		{
			Rev= Rev + S.charAt(i);
		}
		System.out.println(Rev);
	}

}
