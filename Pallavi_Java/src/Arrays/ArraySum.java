package Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int arr[]= {2,5,6,7,5,12,45};
		System.out.println(arr.length);
		int sum= 0;
		
		for (int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of array is " +sum);
	}

}
