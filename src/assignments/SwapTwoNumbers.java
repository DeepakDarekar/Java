package assignments;

import java.util.Scanner;

//Assignment 8:Write the Program to Swap 2 Numbers without using the Temporary Variable
public class SwapTwoNumbers {
	public static void main(String a[]) {
		System.out.println("Enter the First Number :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		//Using arithmatic Operator
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		/*Using Bitwise Operator
		 * num1 = num1 ^ num2;
		 *  num2 = num1 ^ num2; 
		 *  num1 = num1 ^ num2;
		 */
		/*
		 * By Division Operator 
		 * num1 = num1 * num2; \\Lets Say num1=10 and num2=5 then
		 * 10*5=50 Num1 Becomes 50 
		 * num2 = num1\num2;\\50\5=10 so num 2 becomes 10 
		 * num1 =num1\num2; \\50\10=5 so Num1 becomes 5 Swapping is Done
		 * System.out.println("After swaping:" + " num1 = " + num1 + ", num2 = " +
		 * num2);
		 */
		System.out.println("Display the Number After swaping:" + " num1 = " + num1 + ", num2 = " + num2);
		sc.close();
	}

}
