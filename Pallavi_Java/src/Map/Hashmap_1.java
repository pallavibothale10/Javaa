package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap_1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		HashMap < Integer, String > HM= new HashMap < Integer, String>();
		HashMap < Object, Object > HM1= new HashMap < Object, Object>();
        HashMap HM0 = new HashMap();
        HashMap H = new HashMap();

		
		HM.put(101, "David");
		HM.put(102, "Pallavi");
		HM.put(103, "Pranali");
		HM.put(104, "Pallavi");
		HM.put(105, "Poonam");
		HM.put(101, "Suraj");
		HM.put(106, "Shraddha");
		HM.put(108, "Raj");
		HM.put(109, "Raj");
		
		HM1.put(201, "Suraj");
		HM0.put(301, "Shraddha");
		
        System.out.println(HM);
        System.out.println(HM1);
        System.out.println(HM0);
      
		System.out.println(HM.get(101));
		System.out.println(HM.get("Pallavi"));

		System.out.println(HM.containsKey(102));   // key
		System.out.println(HM.containsKey("Poonam"));  //value
		System.out.println(HM.containsKey(108));   // key
		System.out.println(HM.containsKey("rani"));  //value
		
		System.out.println(HM.remove(106, "Rajesh"));
		System.out.println(HM);
		System.out.println(HM.remove(109));
		System.out.println(HM.remove(110));
        System.out.println(HM.keySet());
        System.out.println(HM.values());
        System.out.println(HM.isEmpty());
        System.out.println(H.isEmpty());
        
        //to print all the keys and values
        for(Object obj1 : HM.keySet()) {
        	System.out.println(obj1+" "+HM.get(obj1) );
        }
//        for(Object obj2 : HM.values()) {
//        	System.out.println(obj2 +" "+HM.get(obj2));
//        }
        
        //EntryMethod
        //to print all the keys and values
        System.out.println("*******");
        for(Entry<Integer, String> entry: HM.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
 
        }
        System.out.println("1****OR***1");
        for(Entry entry: HM.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
 
        }
        System.out.println("2****OR***2");
        for(HashMap.Entry entry: HM.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
 
        }
        System.out.println("*******");
     

	}

}
