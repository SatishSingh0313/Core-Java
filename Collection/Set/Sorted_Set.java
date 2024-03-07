package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(5);
        ss.add(15);
        ss.add(25);
        ss.add(10);
        ss.add(13);

        System.out.println("Sorted Set: " + ss); 

        System.out.println("First element: " + ss.first()); 
        System.out.println("Last element: " + ss.last());   

        SortedSet<Integer> subset = ss.subSet(13, 25);
        
        System.out.println("Subset: " + subset);
    }
}


