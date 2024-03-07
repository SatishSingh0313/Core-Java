package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Linked_HashMap {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"Sk");
	hm.put(null, null);
	hm.put(null, "Hii");     
	hm.put(2, null);              
	hm.put(15,"Satish");
	System.out.println(hm);
	
	System.out.println("--------------");
	
	LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(hm);
	
	lhm.put(10, "D.k");
	lhm.put(20,"Sky");
	System.out.println(lhm);
	System.out.println(lhm.get(10));
	System.out.println(lhm.size());
	System.out.println(lhm.remove(null));
	System.out.println(lhm);
		
}
}
