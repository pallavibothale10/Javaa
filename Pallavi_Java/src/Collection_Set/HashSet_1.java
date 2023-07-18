package Collection_Set;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_1 {
public static void main(String[] args) {
		
		HashSet HS = new HashSet();
		//SET and GET method are not present in hashset
		
        HS.add(20);
        HS.add(20);
        HS.add('a');
        HS.add("add");
        HS.add(29.05f);
        HS.add(null);
		HS.add(5);
		HS.add(null);
		System.out.println(HS);
		System.out.println(HS.add('b'));// if u r add duplicate element then it will return false value
		HS.add("java");
		HS.add(5);
		System.out.println(HS);
		
		//remove
		HS.remove(20);
		System.out.println(HS);
		
		//size
		System.out.println(HS.size());
		//addall
		HashSet HS1= new HashSet();
		HS1.addAll(HS);
		System.out.println(HS1);
		
		//removeAll
		HS1.removeAll(HS);
		System.out.println(HS1);
		//contains
		System.out.println(HS.contains('p'));
		System.out.println(HS.contains("java"));
		//isEmpty
		System.out.println(HS.isEmpty());
		
		/*//collectionsClass
		Collections.sort(HS);
		Collections.shuffle(HS);
		System.out.println(HS);*/ // Collections class is not present in HS
		
		
		System.out.println("Reading element using for each");
		//print hashset
		for(Object obj: HS) {
			System.out.println(obj);
		}

}

}
