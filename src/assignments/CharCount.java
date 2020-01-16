package assignments;

import java.util.Scanner;

//Assignment 2:Write a program to find the number of Es in String SELENIUM
public class CharCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.next();
		System.out.println("Enter the latter to count");
		String str2 = sc.next();
		char cha = str2.charAt(0);
		sc.close();
		int count = 0;
		int n = 0;
		for (int i = 0; i < str1.length() - n; i++) {

			if (str1.charAt(i) == cha)

			{
				count++;
			}

		}

		System.out.println(count);

	}

}