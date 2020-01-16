package collection;

import java.util.*;

//To Print the Size of an Object 
public class TestSample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Size : " + list.size());
		System.out.println("List is :" + list.toString());
		System.out.println("Size is Empty or Not :" + list.isEmpty());
		System.out.println("Getting the Value at Index :" + list.get(2));
		System.out.println("Removing :" + list.remove(1));
		list.remove(2);
		System.out.println("After removing Value at index 3:" + list);
		boolean isRemoved = list.remove(Integer.valueOf(1));
		System.out.println("is Value Removed "+isRemoved);
		System.out.println("After removing Value 1 :" + list);
		
		//How To iterate an list using For Loop 
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			Integer[] arr = new Integer[1];
		//Cover array list to array 
		arr = list.toArray(arr);
		
		for(int i = 0;i < arr.length;i++) {
			System.out.println("Array Value "+ arr[i]);
		}
		
	}
}
