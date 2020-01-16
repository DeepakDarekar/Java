package collection;

import java.util.*;
/*
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack(); 
Collection is not design to work for primitive data type its designed for class Type Data Type 
*/

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<double> list = new ArrayList<double>();
		list.add("Jon");
		list.add("Marzena");
		list.add("Robert");
		list.add("Gilbert");
		list.add("92");
		// System.out.println("List is :" + list);
		System.out.println("List is :" + list.toString());
		// Traversing list through iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
