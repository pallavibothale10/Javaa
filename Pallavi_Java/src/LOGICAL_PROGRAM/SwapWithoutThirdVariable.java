package LOGICAL_PROGRAM;

public class SwapWithoutThirdVariable {
public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Before swapping no: " +a +" " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping no: " +a +" "+b);
	}

}
