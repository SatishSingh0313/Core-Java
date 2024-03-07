package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
public static void main(String[] args) {
	
	HashSet<Object> hs = new HashSet<Object>();
	hs.add(100);
	hs.add(150);
	hs.add(100);
	System.out.println(hs);
	
	LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(hs);
	
	lhs.add(10);
	lhs.add(20);
	lhs.add("Satish");
	lhs.add(null);  // you can add only one null value
	lhs.add(false);
	lhs.add("Satish"); // Duplicate not allowed
	
	System.out.println(lhs);
	System.out.println(lhs.remove(100));
	System.out.println(lhs.size());
	
	System.out.println("-----------------------------");
	
	for(Object i:lhs) {   
		System.out.println(i);
	}
	
	System.out.println("---------------------");
	
	Iterator<Object> it=lhs.iterator();  //Iterator type
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
  }
}
