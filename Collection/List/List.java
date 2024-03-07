package link.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
public static void main(String[] args) {
	
	ArrayList<Object> a1 = new ArrayList<Object>();
	a1.add(80);
	a1.add(70);
	a1.add(60);
	
	System.out.println("-----<ArrayList>-----");
	System.out.println(a1);
	
	LinkedList<Object> l1 = new LinkedList<Object>(a1);
	l1.add(85);
	l1.add(90);
	l1.add(87);
	
	System.out.println("-----<LinkedList>-----");
	System.out.println(l1);
	
	Vector<Object> v1 = new Vector<Object>(l1);
	v1.add(95);
	v1.add(94);
	v1.add(100);
	v1.add(99);
	
	System.out.println("-----<Vector>-----");
	System.out.println(v1);

	}
}

