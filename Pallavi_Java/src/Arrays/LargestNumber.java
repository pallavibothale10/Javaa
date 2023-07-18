package Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		
		int arr[]= {8,12,67,9,60};
		System.out.println(arr.length);
		int maximum = arr[0];
		//System.out.println(maximum);
		//0<5
		//1<5
		//2<5
		//3<5
		//4<5
		//5<5 false
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>maximum) {
				//8>8 false
				//12>8 true
				//67>12 true
				//9>67 false
				//67>60true
				maximum = arr[i];
			}
		}
		System.out.println("largest number in given array is "+maximum);
	}
}
