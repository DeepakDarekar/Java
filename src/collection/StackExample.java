package collection;

import java.util.*;

public class StackExample {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Santosh");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Girish");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}