package Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int i1= 10;
//Array is a collection of similar type of element/values
//we can store only fixed set element in java array
//Array is index based and first element of the array is stored at oth index and last index n-1(array name)
		//System.out.println(i1);
		//System.out.println(i2);

		//1.Array Declaration 
		//SYNTAX--> datatype arrayname[]=new datatype [size of array];
		int arr []= new int[10];  
		//we can write also int [] arr = new int[10];
		
		//2.Array initilization
		//SYNTAX--> arrayName[IndexNumber]=value;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		//arr[20]=400; //ArrayIndexOutOfBoundsException
		
		//3.Array usage
		System.out.println();
		System.out.println(arr.length); // to know the array size
		
		System.out.println("Index 5="+arr[5]);
		System.out.println("Index 2="+arr[2]);
		
		for(int i= 0; i<arr.length; i++)
		{
		System.out.println(arr[i]);	
		}

	}

}
