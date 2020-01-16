package deepak;

import java.util.Scanner;

public class EvenOddNumbersBitwiseOperator {

	static int isEven(int n) {
		return (n & 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		sc.close();
		if (isEven(n) == 0)
			System.out.print("The Given Number is Even");
		else
			System.out.print("The Given Number is Odd");
	}
}
