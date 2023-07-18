package Collection_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList1 {
	public static void main(String[] args) {
		
		LinkedList LL = new LinkedList();
		
		//add method
		LL.add(12);
		LL.add('a');
		LL.add("add");
		LL.add("Str");
		LL.add("java");
		LL.add(5);
        LL.add("pal");
       System.out.println("oldlist=" +LL); //[12, a, add, Str, java, 5, pal]
		
       LinkedList LL1 = new LinkedList();
       LL1.add("add");
		LL1.add("str");
		LL1.add("Java");
		System.out.println(LL1);
		
		//sort
		Collections.sort(LL1);
		System.out.println(LL1);
		//shuffle
		Collections.shuffle(LL1);
		System.out.println(LL1);
		
		//reverseorder 
		Collections.sort(LL1, Collections.reverseOrder());
	       System.out.println("Reverse order  "+LL1);
		
		//remove
       LL.remove(3);
       System.out.println(LL);
       System.out.println();
       
       //addAll
       LinkedList NewL= new LinkedList();
       NewL.addAll(LL);
       System.out.println("NewList=" +NewL);
       System.out.println();
       
       //removeAll
       NewL.removeAll(LL);
       System.out.println(NewL);
       System.out.println();
       
       //first element
       System.out.println(LL.getFirst());
       //last element
       System.out.println(LL.getLast());
       System.out.println();
       
      //sort
       //Collections.sort(LL);
       //ClassCastException bcoz we need homo data for sorting , Reverse ordern shuffling
       //System.out.println(LL);
         // ReverseOrder
//       Collections.sort(LL, Collections.reverseOrder());
//       System.out.println(LL);
       //isEmpty
       System.out.println(LL.isEmpty());
       System.out.println();
       
       //contains
       System.out.println(LL.contains("java"));
       System.out.println(LL.contains("Java"));
       System.out.println();
       //for each 
       System.out.println("printing element by for each loop");
       for(Object ref : LL) {
    	   System.out.println(ref);
       }
       
      
	}

}
