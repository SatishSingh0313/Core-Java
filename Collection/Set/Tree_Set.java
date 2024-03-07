package treeset;

import java.util.TreeSet;

public class Tree_Set {
public static void main(String[] args) {
	
	TreeSet<Object> t1 = new TreeSet<Object>();
	t1.add(50);
	t1.add(10);
	t1.add(15);
	t1.add(25);
	t1.add(20);
	System.out.println("-----<TreeSet>-----");
	System.out.println(t1);
	System.out.println(t1.descendingSet());
}
}
