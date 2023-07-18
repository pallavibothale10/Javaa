package Collection_Set;

import java.util.HashSet;

public class HashSet_2 {

	public static void main(String[] args) {
		

		HashSet HS = new HashSet();
		//SET and GET method are not present in hashset
		
        HS.add(20);
        HS.add(22);
        HS.add(21);
        HS.add(23);
        HS.add(200);
        HS.add(220);
        HS.add(213);
        System.out.println(HS);
		HashSet HS1 = new HashSet();
		HS1.add(20);
        HS1.add(122);
        HS1.add(213);
        HS1.add(230);
        HS1.add(200);
        HS1.add(220);
        System.out.println(HS1);
        
        HS.addAll(HS1);
        System.out.println(HS);
        
        HS.retainAll(HS1);
        System.out.println(HS);
        System.out.println("+++++++++++++++++++");
        
       // System.out.println(HS1.containsAll(HS));\
        
        HS1.removeAll(HS);
        System.out.println(HS1);
       // System.out.println(HS1);

	}
}
