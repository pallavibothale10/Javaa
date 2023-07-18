package Collection_list;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		Vector V1= new Vector();   //hetro
		Vector<String> V2= new Vector<String>(); // homo
		V2.add("asf");
		V2.add("ddd");
		V2.add("aa");
		System.out.println(V2);
		System.out.println();
		
		//insert/add element
		V1.add("java");
		V1.add(2);
		V1.add('A');
		V1.add("test");
		V1.add(true);
		
		System.out.println(V1);
		
		//size
		System.out.println(V1.size());
		
		//remove
//		System.out.println(V1.remove(3));
//		System.out.println(V1);
		//or
		V1.remove(2);
		System.out.println(V1);
		
		//update
		V1.set(3, "Python");
		V1.set(0, 1000);
        System.out.println(V1);

V1.add('c');
System.out.println(V1);

//addAll
Vector V3= new Vector();
V3.addAll(V1);
System.out.println(V3);  
System.out.println();

//removeAll
V1.removeAll(V3);
System.out.println(V3);

//collection class
Collections.sort(V2);
System.out.println(V2);

	}

}
