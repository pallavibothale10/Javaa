package Arrays;

public class Array3 {
	public static void main(String[] args) {
		
		//String Str1[]= new String [-2];//negative array size not allowed

		String Str[]= new String [5];
		
		Str[0]="Java";
		Str[1]="Automation";
		Str[2]="12345";
		Str[3]="@#$^&";
		Str[4]="Java10";
		
		System.out.println(Str.length);
		System.out.println();
		for (int i = 0; i<Str.length;i++)
		{
			System.out.println(Str[i]);
		}

		
	}

}
