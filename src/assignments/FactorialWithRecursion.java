package assignments;

import java.util.Scanner;

public class FactorialWithRecursion {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {
		System.out.println("Enter the Number for Which you want the Factorial:");
		Scanner sc = new Scanner(System .in);
		int n = sc.nextInt();
		int fact = 1;
		fact = factorial(n);
		System.out.println("Factorial of the given Number is: " + fact);
		sc.close();
	}
}