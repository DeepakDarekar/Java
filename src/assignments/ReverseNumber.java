package assignments;

import java.util.Scanner;

//Assignment 1:Write a Program to Reverse any number using While Loop
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 0;
		int reverse = 0;
		int reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse :");
		num = sc.nextInt();
		sc.close();

		// lets say num value is 642
		while (num != 0) {// Num value is not equal to O so it enteres the while Loop
			reminder = num % 10;// 642%10 will give the remoinder as 2 and it is assigned to reminder
			reverse = reverse * 10 + reminder;// Initial Value of Reverse is 0 *10b is 0 and Reminder value is 2 so
												// reverse will store the value 2
			num = num / 10;// 642/10 is 64 so again loop Check 64 is is Equal to O or Not

		}

		System.out.println("Reverse of the number is " + reverse);

	}

}
