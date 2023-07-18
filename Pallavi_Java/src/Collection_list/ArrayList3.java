package Collection_list;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
public static void main(String[] args) {
	
	//convert a array into arraylist
	String arr[]= {"abc", "xyz", "pqr"};
	for(Object obj: arr) {
		System.out.println(obj);
	}
	System.out.println();
	System.out.println("Array into arraylist");
	
	ArrayList List= new ArrayList(Arrays.asList(arr));
	for(Object obj : List) {
		System.out.println(obj);
	}
	
	
}
}
