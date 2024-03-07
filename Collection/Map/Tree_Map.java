package map;

import java.util.TreeMap;

public class Tree_Map {
   public static void main(String[] args) {
	   
	TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
	tm.put("A", 10);
	tm.put("B", 20);
	tm.put("C",10);
	tm.put("A", 40);
	System.out.println(tm);
	
	tm.remove("C");
	System.out.println(tm);
	System.out.println(tm.get("A"));
	
	
	
}
}
