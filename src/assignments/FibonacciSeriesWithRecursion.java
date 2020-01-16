package assignments;
//Assignment 9:Java Program to Print the Fibonacci Series without using Recursion

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {
	static int num1 = 0, num2 = 1, sum = 0;
	public static void fibbonacci(int count) {
		if (count > 0) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" " + sum);
			fibbonacci(count - 1);
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter the number for that you want the Fibonacci Series:");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		System.out.print(num1 + " " + num2);
		fibbonacci(count - 2);
	}
}
