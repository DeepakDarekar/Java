package collection;

import java.util.*;

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ashish");
		al.add("Amol");
		al.add("Shailesh");
		al.add("Santosh");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
