package map;

import java.util.HashMap;

public class Hash_Map {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"Apple");
	hm.put(null, null);
	hm.put(null, "Hii");     
	hm.put(2, null);              
	hm.put(15,"Banana");
	System.out.println(hm);
	
	System.out.println(hm.get(15));
	hm.put(5, "Orange");
	
	System.out.println(hm.size());
    System.out.println(hm);	
    System.out.println(hm.remove(5));
    System.out.println(hm);
	
	
}
}
