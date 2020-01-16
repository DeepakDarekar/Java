package assignments;
//Assignment 9:Java Program to Print the Fibonacci Series without using Recursion
import java.util.Scanner;

public class FibonacciSeriesWitoutRecursion {
	/*
	 * public static void main(String[] args) {
	 * 
	 * int i = 1,no1 = 0, no2 = 1;
	 * System.out.print("First 10 Numbers of fibonicial Series: ");
	 * 
	 * while (i <= n) { System.out.print(no1 + " , ");
	 * 
	 * int sum = no1 + no2; no1 = no2; no2 = sum;
	 * 
	 * i++; } } }
	 */

	// Using For Loop
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("How many Fibonical Series numbers you want: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; ++i) {
			System.out.print(num1 + " , ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
