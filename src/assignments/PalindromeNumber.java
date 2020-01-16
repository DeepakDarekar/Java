package assignments;
//Assignment 11:To check the Palindrome Number
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		int reminder, sum = 0, temp;
		System.out.println("Enter the Number to Check Palindrome Number Or Not :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		temp = number;
		while (number > 0) {
			reminder = number % 10; // getting remainder
			sum = (sum * 10) + reminder;
			number = number / 10;
		}

		if (temp == sum)
			System.out.println("Given Number is palindrome number ");
		else
			System.out.println("Given Number is not palindrome");
		sc.close();
	}

}
