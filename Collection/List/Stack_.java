package link.list;
import java.util.Stack;

public class Stack_ {
	public static void main(String[] args) {
		Stack<Object> s1 = new Stack<Object>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(10);
		s1.push(70);
		System.out.println(s1);
		System.out.println((s1.pop()));
	}
}
