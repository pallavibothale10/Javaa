package Arrays;

public class Array9 {
	public static void main(String[] args) {
		
		//4*3 4#5
		
		int arr []= {2, 3, 4};
		int number[][]= {{2,3,4},{4,6,4},{4,7,2},{7,4,6}};

//      0 1 2 col
//row		
// 0    2 3 4
// 1    4 6 4
// 2    4 7 2
// 3    7 4 6

		System.out.println("*********NEW CHANGES**********");
		
		System.out.println(number.length);
		System.out.println(number[0].length);
		
		System.out.println(number[2][1]); //7
		System.out.println(number[3][2]); //6
		for (int i= 0; i<number.length;i++)
		{
			for (int j= 0; j<number[0].length;j++)
			{
				System.out.print(number[i][j] +" ");
			}
			System.out.println();

		}
		


}
}