package Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		
		int arr[]= { 2, 3, 4, 5, 3, 7, 9, 1,5};
		System.out.println("Duplicate element in given array");
		
		for (int i = 0; i<arr.length;i++)   //
			
		{
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]+" ");
				}
				
			}
		}

}
}