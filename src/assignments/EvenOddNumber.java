package assignments;

import java.util.Scanner;

//Assignment 7:Write a Program to Check given number is Odd or Even without using Modulus Operator
public class EvenOddNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int number = sc.nextInt();
	int result = (number/2)*2;
	sc.close();
	if(result==number){	
		System.out.println("The Given number is Even");
	}
	else {
		System.out.println("The Given number is Odd");
	}
}
}
/*Using Bitwise Operator 

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
*/