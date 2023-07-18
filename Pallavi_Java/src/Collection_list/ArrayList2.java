package Collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
public static void main(String[] args) {
	
	ArrayList A= new ArrayList();
	A.add("a");
	//A.add(1);
	A.add("d");
	A.add("c");
	//A.add(3);
	A.add("b");
	
	System.out.println(A);
	//1.Duplicate
	ArrayList Duplicate = new ArrayList();
	Duplicate.addAll(A);
	System.out.println(Duplicate);
	//2. remove all
	Duplicate.removeAll(A);
	System.out.println(Duplicate);
	
	//3. Collection 
	System.out.println(A);
	Collections.sort(A);
	System.out.println(A);
	
	//reverse
	Collections.reverse(A);
	System.out.println(A);
	
	//to set desending and reverse
	Collections.sort(A, Collections.reverseOrder());
	System.out.println(A);
	//shuffle
	Collections.shuffle(A);
	System.out.println(A);;
}
}
