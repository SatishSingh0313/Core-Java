 package link.list;

import java.util.LinkedList;

public class Linked_List {
public static void main(String[] args) {
	
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	System.out.println(l1);
	
	for(int i=1;i<l1.size();i++) {
		System.out.println(l1.poll());
	}
}
}
