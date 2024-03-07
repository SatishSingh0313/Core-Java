package set;

import java.util.HashSet;

public class Hash_Set {
public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<>();

    hs.add("Apple");
    hs.add("Banana");
    hs.add("Orange");

    hs.add("Apple");  // duplicate not allowed
    System.out.println(hs); 
    hs.add(null);  //You can add only one null value
   

   
    System.out.println(hs);  
    hs.remove("Banana");

   
    hs.contains("Orange");
    System.out.println(hs);
   }
}
