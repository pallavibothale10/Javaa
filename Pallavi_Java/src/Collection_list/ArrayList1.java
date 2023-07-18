package Collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//declaration of arrylist
		ArrayList AL= new ArrayList();  //dyanamic arry = hetro and homo type data
		ArrayList<String> AL1= new ArrayList<String>(); //static arry
//		ArrayList<Integer> AL2 = new 	ArrayList<Integer>();
//		AL2.add(123);
//		System.out.println("AL2= "+AL2);
		/*AL1.add("java");
		AL1.add(true);
		AL1.add(33);*/ //-->this is static arrylist so we can add only string value
		
		// 1. Add - to add the element in arraylist
		AL.add("Java");
		AL.add(true);
		AL.add(20);
		AL.add(30.8);
		AL.add('A');
		AL.add(null);
		AL.add(300);
		System.out.println(AL);
		System.out.println(AL.add(300));
		//2. Size-[syso(Ref variable.size()return the number of elements in this list.
		System.out.println("Number of element in the given Arraylist "+AL.size());
		AL.add(4000);
		AL.add(200);
		AL.add("Test");
		System.out.println(AL.size());

		//3. Remove -SYNTAX--> RefVariable.remove(element);
		AL.remove(30.8);
		AL.remove(true);
		System.out.println(AL);
		
		//4. Insert new element
		AL.add(20);
		AL.add(2,false);//2 is the index /position
		AL.add(3,"python");
		System.out.println(AL);
		
		//5. Retrieve Specific element
		//get-returns the element at the specific position in this list-->syso(RefVariable.get(index))
		System.out.println(AL.get(3));
		//System.out.println(AL.get(30)); Index 30 out of bounds for length 11
		//error--> IndexOutOfBoundsException
		System.out.println(AL.get(0));
		
		//6.Replace/change method-->RefVariable.set(int index, element)
		AL.set(3, "automation");
		System.out.println(AL);
		AL.set(1, 2000);
		System.out.println(AL);
		
		//7. isEmpty
		System.out.println(AL.isEmpty());
		System.out.println(AL1.isEmpty());
		
		//8.Read and print the data
		System.out.println("Reading element using for loop ");
		//0<10- true
		//1<10 - true
		//10<10- false
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		System.out.println("Reading element using for each loop ");
		//for each loop
		for(Object obj: AL) {//for(datatype variable:Ref variable)
			System.out.println(obj);
		}
		System.out.println();		
		System.out.println("Reading element using iterators ");
		//iterators
		Iterator AL21=AL.iterator();
		while(AL21.hasNext()) {// hasNext returns true or false
			System.out.println(AL21.next());//20
		}
		
	}
}
