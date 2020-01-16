package collection;

import java.util.*;
//Set<data-type> s1 = new HashSet<data-type>();  
//Set<data-type> s2 = new LinkedHashSet<data-type>();  
//Set<data-type> s3 = new TreeSet<data-type>(); 

//HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.

//Consider the following example.

public class HashSetExample {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}