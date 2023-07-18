package Arrays;

public class ReverseOrder {
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,67,8,9,5};
		System.out.println(arr.length);
		System.out.println("original array");
		
		for (int i= 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse array");

		for (int j= 7; j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
