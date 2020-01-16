package deepak;

import java.util.*;

class ReverseString {
	public static void main(String[] args) {
		String Original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		Original = sc.nextLine();
		int length = Original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + Original.charAt(i);
		System.out.println("Reverse of Entered String is: " + reverse);
		sc.close();
	}
}
